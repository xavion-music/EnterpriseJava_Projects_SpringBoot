package ca.sheridancollege.chaupala.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ca.sheridancollege.chaupala.beans.Recipe;

@Controller
public class RecipeController {

    public ArrayList<Recipe> recipeList = new ArrayList<>();

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("recipe", new Recipe());
        model.addAttribute("recipeList", recipeList);
        return "index";
    }

    @PostMapping("/addRecipe")
    public String addRecipe(@ModelAttribute Recipe recipe, Model model) {
        recipeList.add(recipe);

        System.out.println("Added Recipes:");
        for (Recipe r : recipeList) {
            System.out.println("ID: " + r.getId() + ", Name: " + r.getName() + ", Ingredients: " + r.getIngredients() + ", Type: " + r.getType());
        }
        System.out.println("-----");

        model.addAttribute("recipe", new Recipe());
        model.addAttribute("recipeList", recipeList);
        return "index";
    }
}
