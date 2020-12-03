CREATE TABLE movie
(
    id         VARCHAR(30) NOT NULL,
    title      VARCHAR(30) NOT NULL,
    thumbsup   int(10)     NOT NULL,
    thumbsdown int(10)     NOT NULL,
    PRIMARY KEY (id)
);