package com.springrest.springrest.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springrest.springrest.entities.Course;

public interface CourseDao extends JpaRepository<Course,Long> {  // entity class name and @id ka data type
	
	List<Course> findByTitle(String title);
	
	List<Course> findByDescription(String description);
	
	List<Course> findByDescriptionContaining(String keyword);
	
	@Query("Select c from Course c where length(c.description)>=?1")
	List<Course>getCoursesWithMinDescriptionLengthJPQL(int minlen);
	
}
