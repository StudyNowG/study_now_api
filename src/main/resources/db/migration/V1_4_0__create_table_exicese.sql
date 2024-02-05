CREATE TABLE exercise(
    id BIGSERIAL NOT NULL,
    statement VARCHAR(1000) NOT NULL,
    resolution_link VARCHAR(150) NOT NULL,
    lesson_id int8 NOT NULL,
    CONSTRAINT pk_exercise PRIMARY KEY(id),
    CONSTRAINT fk_exercise_lesson FOREIGN KEY(lesson_id) REFERENCES lesson(id) ON DELETE CASCADE ON UPDATE CASCADE
);