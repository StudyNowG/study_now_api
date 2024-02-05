package com.study_now.application.service;

import com.study_now.common.dto.StudentDTO;
import com.study_now.domain.entities.Student;

import java.util.List;

public interface IStudentService {
    List<StudentDTO> findAll();
    StudentDTO create(StudentDTO student);
}
