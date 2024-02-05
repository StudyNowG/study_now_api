package com.study_now.presentarion;

import com.study_now.application.service.IStudentService;
import com.study_now.common.dto.ResponseApiDTO;
import com.study_now.common.dto.StudentDTO;
import com.study_now.domain.entities.Student;
import com.study_now.domain.enumaration.MessageEnum;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.study_now.application.strategy.Translator.toMessage;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentController {

    private final IStudentService studentService;

    @PostMapping
    public ResponseEntity<?> postStudent(@RequestBody @Valid StudentDTO dto){
        studentService.create(dto);

        ResponseApiDTO response = ResponseApiDTO.builder()
                .status(HttpStatus.CREATED.value())
                .message(toMessage(MessageEnum.SAVE_SUCCESS, toMessage(Student.class))).build();

        return ResponseEntity.status(response.status()).body(response);
    }


}
