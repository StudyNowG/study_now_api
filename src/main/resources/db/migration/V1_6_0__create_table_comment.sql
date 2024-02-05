CREATE TABLE comment(
	id BIGSERIAL NOT NULL,
	description varchar(250) NOT NULL,
	exercise_id int8 NOT NULL,
	student_id int8 NOT NULL,
	comment_id int8 DEFAULT NULL,
	CONSTRAINT pk_comment PRIMARY KEY(id),
	CONSTRAINT fk_comment_exercise FOREIGN KEY(exercise_id) REFERENCES exercise(id) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT fk_comment_student FOREIGN KEY(student_id) REFERENCES student(id) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT fk_comment_comment FOREIGN KEY(comment_id) REFERENCES comment(id) ON DELETE SET NULL ON UPDATE SET NULL
);