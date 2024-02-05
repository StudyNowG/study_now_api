CREATE TABLE lesson(
    id BIGSERIAL NOT NULL,
    description VARCHAR(200) NOT NULL,
    video_link  VARCHAR(200) NOT NULL,
    module_id int8 NOT NULL,
    CONSTRAINT pk_lesson PRIMARY KEY(id),
    CONSTRAINT fk_lesson_module FOREIGN KEY(module_id) REFERENCES module(id) ON DELETE CASCADE ON UPDATE CASCADE
);
