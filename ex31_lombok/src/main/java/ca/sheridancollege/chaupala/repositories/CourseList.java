package ca.sheridancollege.chaupala.repositories;

import ca.sheridancollege.chaupala.beans.Course;
import java.util.List;

public interface CourseList {
    List<Course> getCourseList();
    void setCourseList(List<Course> courseList);
    void emptyList();
}
