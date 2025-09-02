package ca.sheridancollege.chaupala.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import ca.sheridancollege.chaupala.beans.Course;
import lombok.Data;

@Component
@Data
public class CourseListImpl implements CourseList {

    
    private List<Course> courseList = new ArrayList<>();

    public void emptyList() {
        courseList.clear(); 
    }
}
