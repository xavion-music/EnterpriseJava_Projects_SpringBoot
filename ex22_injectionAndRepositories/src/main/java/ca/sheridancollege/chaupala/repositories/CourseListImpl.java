package ca.sheridancollege.chaupala.repositories;

import ca.sheridancollege.chaupala.beans.Course;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class CourseListImpl implements CourseList {

    private List<Course> courseList = new CopyOnWriteArrayList<Course>();

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void emptyList() {
        courseList.clear();
    }
}
