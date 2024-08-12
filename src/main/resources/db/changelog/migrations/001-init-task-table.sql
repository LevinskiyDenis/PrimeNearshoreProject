CREATE TABLE task
(
    id          BIGSERIAL PRIMARY KEY,
    description VARCHAR(200) NOT NULL,
    priority    BIGINT
);
