CREATE TABLE module(
    id BIGSERIAL NOT NULL,
    title VARCHAR(150) NOT NULL,
    description VARCHAR(300) NOT NULL,
    expect_total_hours INT NOT NULL,
    subject_id int8 NOT NULL,
    CONSTRAINT pk_module PRIMARY KEY(id),
    CONSTRAINT fk_module_subject FOREIGN KEY(subject_id) REFERENCES subject(id) ON DELETE CASCADE ON UPDATE CASCADE
);
