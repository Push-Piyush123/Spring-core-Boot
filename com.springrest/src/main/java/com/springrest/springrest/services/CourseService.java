package com.springrest.springrest.services;
import java.util.List;

import com.springrest.springrest.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses(); // all course return 
	
	public Course addCourse(Course course);  // after adding course we return that course
		
	public Course getCourse(long courseId);
	
	public Boolean deleteCourse(Long courseId);
	
	public Course updateCourse(Course course);
	
//	public List<Course> findByTitle(String title);
//	
//	public List<Course> findBydescription(String description);
//	
//	public List<Course> findBydescriptionContaining(String keyword);
//	
//	public List<Course> findBydescriptionminlen(int min);

}
