package com.study_now.application.service.impl;

import com.study_now.application.service.IStudentService;
import com.study_now.common.dto.StudentDTO;
import com.study_now.common.mappers.StudentMapper;
import com.study_now.domain.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService implements IStudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapStruct;

    public List<StudentDTO> findAll() {
        return studentMapStruct
                .toListDTO(studentRepository.findAll());
    }

    public StudentDTO create(StudentDTO student) {
        return studentMapStruct
                .toDTO(studentRepository
                        .save(studentMapStruct.toModel(student)));


    }
}
