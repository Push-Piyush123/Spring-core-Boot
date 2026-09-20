package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home() {
        return "Welcome to course application";
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseService.getCourses();
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return this.courseService.addCourse(course);
    }
    
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
    	return this.courseService.getCourse(Long.parseLong(courseId));
    }
    
    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course) {
    	return this.courseService.updateCourse(course);
    }
    
    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<String> deleteCourse(@PathVariable Long courseId) {

        Boolean isdeleted = this.courseService.deleteCourse(courseId);

        if (!isdeleted) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok("Record deleted");
    }
    
//    @GetMapping("/title/{title}")
//    public List<Course> findBytitle(@PathVariable String title){
//    	
//    	return this.courseService.findByTitle(title);
//		
//    }
//    
//    @GetMapping("/description/{description}")
//    public List<Course> findBydescription(@PathVariable String description){
//    	
//    	List<Course> courses=this.courseService.findBydescription(description);
//		return courses;
//    }
//    
//    @GetMapping("/description/keyword/{keyword}")
//    public List<Course> findBykeyword(@PathVariable String keyword){
//    	
//    	List<Course> courses=this.courseService.findBydescriptionContaining(keyword);
//		return courses;
//    }
//    @GetMapping("/description/minlen/{minlen}")
//    public List<Course> findBydescminlen(@PathVariable int minlen){
//    	
//    	List<Course> courses=this.courseService.findBydescriptionminlen(minlen);
//		return courses;
//    }

}