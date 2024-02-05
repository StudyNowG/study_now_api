package com.study_now.presentarion;

import com.study_now.application.service.ISubjectService;
import com.study_now.common.dto.ResponseApiDTO;
import com.study_now.common.dto.SubjectDTO;
import com.study_now.domain.entities.Student;
import com.study_now.domain.entities.Subject;
import com.study_now.domain.enumaration.MessageEnum;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.study_now.application.strategy.Translator.toMessage;

@RestController
@RequestMapping("/subject")
@AllArgsConstructor
public class SubjectController {

    private final ISubjectService subjectService;

    @PostMapping
    public ResponseEntity<ResponseApiDTO> postSubject(@RequestBody @Valid SubjectDTO subjectDTO){
        subjectService.create(subjectDTO);
        ResponseApiDTO response = ResponseApiDTO.builder()
                .status(HttpStatus.CREATED.value())
                .message(toMessage(MessageEnum.SAVE_SUCCESS, toMessage(Subject.class))).build();

        return ResponseEntity.status(response.status()).body(response);
    }

}
