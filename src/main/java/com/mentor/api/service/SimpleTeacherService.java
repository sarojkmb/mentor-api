package com.mentor.api.service;

import com.mentor.api.repo.TeacherRepo;
import com.mentor.api.entities.Review;
import com.mentor.api.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;

@Service
public class SimpleTeacherService {

    private final TeacherRepo teacherRepo;

    @Autowired
    public SimpleTeacherService(TeacherRepo teacherRepo) {
        this.teacherRepo = teacherRepo;
    }

    //@Override
    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void addReview(String teacherID, Review review) {
        Objects.requireNonNull(teacherID);
        Objects.requireNonNull(review);

        Teacher teacher = teacherRepo
                .findById(UUID.fromString(teacherID))
                .orElseThrow(() -> new EntityNotFoundException(teacherID));

        review.setDate(LocalDate.now());

        if(teacher.getReviews() == null){
            teacher.setReviews(new ArrayList<>());
        }

        teacher.getReviews().add(review);

        teacherRepo.save(teacher);

    }
}
