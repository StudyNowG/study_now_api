package com.study_now.service;

import com.study_now.application.service.impl.StudentService;
import com.study_now.common.dto.StudentDTO;
import com.study_now.common.mappers.StudentMapper;
import com.study_now.domain.entities.Student;
import com.study_now.domain.repository.StudentRepository;
import com.study_now.mock.StudentDTOMock;
import com.study_now.mock.StudentMock;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {
    @InjectMocks
    private StudentService studentService;
    @Mock
    private StudentRepository studentRepository;
    @Mock
    private StudentMapper studentMapper;

    @Test
    void given_StudentObject_when_SaveStudent_then_ReturnSavedStudent(){
        final Student student = StudentMock.mock();
        final StudentDTO studentDTO = StudentDTOMock.mock();
        when(studentRepository.save(student)).thenReturn(student);
        when(studentMapper.toDTO(student)).thenReturn(studentDTO);
        when(studentMapper.toModel(studentDTO)).thenReturn(student);


        final StudentDTO studentSaved = studentService.create(studentDTO);

        assertNotNull(studentSaved);
        assertEquals(studentSaved.name(), student.getName());
    }
}
