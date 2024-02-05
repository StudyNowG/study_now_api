package com.study_now.common.mappers;

import com.study_now.common.dto.StudentDTO;
import com.study_now.common.dto.SubjectDTO;
import com.study_now.domain.entities.Student;
import com.study_now.domain.entities.Subject;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SubjectMapper {
    SubjectDTO toDTO(Subject subject);
    List<SubjectDTO> toListDTO(List<Subject> subjects);
    Subject toModel(SubjectDTO subjectDTO);
}
