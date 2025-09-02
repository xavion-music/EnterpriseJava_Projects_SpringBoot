package ca.sheridancollege.chaupala.beans;

public class Recipe {
    private long id;
    private String name;
    private String ingredients;
    private String type;
    public static final String[] TYPES = {"Vegetarian","Non-Vegetarian","Vegan","Dessert"};

    public Recipe() {}

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getIngredients() { return ingredients; }
    public void setIngredients(String ingredients) { this.ingredients = ingredients; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}
