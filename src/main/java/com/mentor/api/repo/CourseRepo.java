package com.mentor.api.repo;

import com.mentor.api.entities.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CourseRepo extends CrudRepository<Course, UUID> {
}
