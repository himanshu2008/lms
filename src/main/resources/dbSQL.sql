CREATE DATABASE IF NOT EXISTS lms;
USE lms;

DROP TABLE IF EXISTS bookS;

CREATE TABLE books(
	id int AUTO_INCREMENT,
    isbn VARCHAR(13) NOT NULL,
    name VARCHAR(50) NOT NULL,
    author VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);

select * from books;