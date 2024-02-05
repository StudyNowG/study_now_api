package com.study_now.common.mappers;

import com.study_now.common.dto.StudentDTO;
import com.study_now.domain.entities.Student;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface StudentMapper {
    StudentDTO toDTO(Student student);
    List<StudentDTO> toListDTO(List<Student> students);
    Student toModel(StudentDTO studentDTO);
}
