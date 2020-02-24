package com.mentor.api.repo;

import com.mentor.api.entities.Teacher;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TeacherRepo extends CrudRepository<Teacher, UUID> {
}
