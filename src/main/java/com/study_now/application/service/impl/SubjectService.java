package com.study_now.application.service.impl;

import com.study_now.application.service.ISubjectService;
import com.study_now.common.dto.SubjectDTO;
import com.study_now.common.mappers.SubjectMapper;
import com.study_now.domain.repository.SubjectRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SubjectService implements ISubjectService {
    private final SubjectRepository subjectRepository;
    private final SubjectMapper subjectMapper;

    public SubjectDTO create(SubjectDTO subject) {
        return subjectMapper
                .toDTO(subjectRepository
                        .save(subjectMapper.toModel(subject)));
    }
}
