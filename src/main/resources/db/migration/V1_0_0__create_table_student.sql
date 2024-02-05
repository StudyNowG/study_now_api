CREATE TABLE student(
    id BIGSERIAL NOT NULL,
    name VARCHAR(200) NOT NULL,
    birth_day_date DATE NOT NULL,
    email VARCHAR(150) NOT NULL,
    desire_course VARCHAR(150) NOT NULL,
    CONSTRAINT pk_student PRIMARY KEY(id)
);
