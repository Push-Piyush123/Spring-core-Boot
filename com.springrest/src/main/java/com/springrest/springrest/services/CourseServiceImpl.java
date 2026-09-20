package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{
	
//	@Autowired   
//	private CourseDao repository;   // dependency of repository layer
	List<Course>list;
	
	public CourseServiceImpl() {
		list=new ArrayList<>();
	}
	
	public Course addCourse(Course course) {
		 list.add(course);
		 return course;
		
	}

	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		Course c=null;
		for(Course course:list) {
			if(course.getId()==courseId)
				c=course;
			break;
		}
			
		return c;
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		 //List<Course>courselist = repository.findAll();
		 return list;
	}
	
	@Override
	public Boolean deleteCourse(Long courseId) {
	    
	   // Boolean iscourse = repository.existsById(courseId);
//
//	    if (!iscourse) {
//	        return false;
//	    }
//
//	    repository.deleteById(courseId);
//	    return true;
//	}
	    for(Course e : list) {

	        if(e.getId() == courseId) {
	            list.removeIf(c -> c.getId() == courseId);
	            return true;
	        }
	    }

	    return false;
	}
	
	@Override
	public Course updateCourse(Course course) {
	    
	    for(int i = 0; i < list.size(); i++) {
	        
	        if(list.get(i).getId() == course.getId()) {
	            
	            list.set(i, course);   // replace old course with new course
	            return course;
	        }
	    }
	    
	    return null;   // course not found
	}
//	@Override
//	public Course updateCourse(Course course) {
//		Course c=null;
//		int id=course.getId();
//		for(Course course:list) {
//			if(course.getId()==id)
//				c=course;
//			break;
//		}
//			
//		//return repository.save(course);
//	}

//@Override
//public List<Course> findByTitle(String title) {
//	// TODO Auto-generated method stub
//	return repository.findByTitle(title);
//}
//
//@Override
//public List<Course> findBydescription(String description) {
//	// TODO Auto-generated method stub
//	
//	return repository.findByDescription(description);
//}
//
//@Override
//public List<Course> findBydescriptionContaining(String keyword) {
//	// TODO Auto-generated method stub
//	return repository.findByDescriptionContaining(keyword);
//}
//
//@Override
//public List<Course> findBydescriptionminlen(int min) {

//	return repository.getCoursesWithMinDescriptionLengthJPQL(min);
//}


}
	




//package com.springrest.springrest.services;
//
//import java.util.List;
//import java.util.NoSuchElementException;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.springrest.springrest.dao.CourseDao;
//import com.springrest.springrest.entities.Course;
//
//@Service
//public class CourseServiceImpl implements CourseService {
//
//    @Autowired
//    private CourseDao repository;
//
//
//    // ADD COURSE
//    @Override
//    public Course addCourse(Course course) {
//
//        if (course == null) {
//            throw new IllegalArgumentException("Course cannot be null");
//        }
//
//        return repository.save(course);
//    }
//
//
//    // GET COURSE
//    @Override
//    public Course getCourse(long courseId) {
//
//        // 1. ArithmeticException
//        int a = 100 / 0;
//
//        Optional<Course> course = repository.findById(courseId);
//
//        if (course.isPresent()) {
//            return course.get();
//        }
//
//        // 2. NoSuchElementException
//        throw new NoSuchElementException(
//                "Course with id " + courseId + " not found"
//        );
//    }
//
//
//    // GET ALL COURSES
//    @Override
//    public List<Course> getCourses() {
//
//        List<Course> courseList = repository.findAll();
//
//        if (courseList.isEmpty()) {
//            throw new NoSuchElementException("No courses available");
//        }
//
//        return courseList;
//    }
//
//
//    // DELETE COURSE
//    @Override
//    public Boolean deleteCourse(Long courseId) {
//
//        if (courseId == null) {
//            throw new IllegalArgumentException("Course ID cannot be null");
//        }
//
//        Boolean iscourse = repository.existsById(courseId);
//
//        if (!iscourse) {
//            throw new NoSuchElementException(
//                    "Course with id " + courseId + " not found"
//            );
//        }
//
//        repository.deleteById(courseId);
//
//        return true;
//    }
//
//
//    // UPDATE COURSE
//    @Override
//    public Course updateCourse(Course course) {
//
//        if (course == null) {
//            throw new IllegalArgumentException("Course cannot be null");
//        }
//
//        return repository.save(course);
//    }
//
//
//    // FIND BY TITLE
//    @Override
//    public List<Course> findByTitle(String title) {
//
//        if (title == null || title.isEmpty()) {
//            throw new IllegalArgumentException(
//                    "Title cannot be empty"
//            );
//        }
//
//        return repository.findByTitle(title);
//    }
//
//
//    // FIND BY DESCRIPTION
//    @Override
//    public List<Course> findBydescription(String description) {
//
//        if (description == null || description.isEmpty()) {
//            throw new IllegalArgumentException(
//                    "Description cannot be empty"
//            );
//        }
//
//        return repository.findByDescription(description);
//    }
//
//
//    // FIND BY DESCRIPTION CONTAINING
//    @Override
//    public List<Course> findBydescriptionContaining(String keyword) {
//
//        if (keyword == null || keyword.isEmpty()) {
//            throw new IllegalArgumentException(
//                    "Keyword cannot be empty"
//            );
//        }
//
//        return repository.findByDescriptionContaining(keyword);
//    }
//
//
//    // FIND BY MIN DESCRIPTION LENGTH
//    @Override
//    public List<Course> findBydescriptionminlen(int min) {
//
//        if (min < 0) {
//            throw new IllegalArgumentException(
//                    "Minimum length cannot be negative"
//            );
//        }
//
//        return repository.getCoursesWithMinDescriptionLengthJPQL(min);
//    }
//}


//@Service
//public class CourseServiceImpl implements CourseService{
//	
//	@Autowired   
//	private CourseDao repository;   // dependency of repository layer
////	List<Course>list;
//	
////	public CourseServiceImpl() {
////		list=new ArrayList<>();
////	}
//	
//	public Course addCourse(Course course) {
//		return repository.save(course);
//		
//	}
//
//	@Override
//	public Course getCourse(long courseId) {
//		// TODO Auto-generated method stub
//		
//		int a=100/0;
//		
//		
//		Optional<Course>course=repository.findById(courseId);
//		
//		if(course.isPresent()) {
//			return course.get();
//		}
//		return null;
////	   Course c=null;
////		for(Course course:list) {
////			if(course.getId()==courseId)
////				c=course;
////			break;
////		}
////			
////		return c;
//	}
//
//	@Override
//	public List<Course> getCourses() {
//		// TODO Auto-generated method stub
//		 List<Course>courselist = repository.findAll();
//		 return courselist;
//	}
//	
//	@Override
//	public Boolean deleteCourse(Long courseId) {
//	    
//	    Boolean iscourse = repository.existsById(courseId);
//
//	    if (!iscourse) {
//	        return false;
//	    }
//
//	    repository.deleteById(courseId);
//	    return true;
//	}
////	    for(Course e : list) {
////
////	        if(e.getId() == courseId) {
////	            list.removeIf(c -> c.getId() == courseId);
////	            return e;
////	        }
////	    }
////
////	    return null;
////	}
//
//	@Override
//	public Course updateCourse(Course course) {
//			
//		return repository.save(course);
//	}
//
//@Override
//public List<Course> findByTitle(String title) {
//	// TODO Auto-generated method stub
//	return repository.findByTitle(title);
//}
//
//@Override
//public List<Course> findBydescription(String description) {
//	// TODO Auto-generated method stub
//	
//	return repository.findByDescription(description);
//}
//
//@Override
//public List<Course> findBydescriptionContaining(String keyword) {
//	// TODO Auto-generated method stub
//	return repository.findByDescriptionContaining(keyword);
//}
//
//@Override
//public List<Course> findBydescriptionminlen(int min) {
//	// TODO Auto-generated method stub
//	return repository.getCoursesWithMinDescriptionLengthJPQL(min);
//}
//
//
//}
//		
		