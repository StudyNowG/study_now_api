CREATE TABLE answer(
    id BIGSERIAL NOT NULL,
    content VARCHAR(800),
    exercise_id int8 NOT NULL,
    CONSTRAINT pk_answer PRIMARY KEY(id),
    CONSTRAINT fk_answer_exercise FOREIGN KEY(exercise_id) REFERENCES exercise(id) ON DELETE CASCADE ON UPDATE CASCADE
);