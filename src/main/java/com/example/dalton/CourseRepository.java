package com.example.dalton;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long>{
    //Course findCourseBy(long id);
}
