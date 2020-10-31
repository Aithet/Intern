create database DB;
use DB;

create table groupp
(
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(160) NOT NULL,
    PRIMARY KEY(id)
);

create table student
(
    id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(160) NOT NULL,
    last_name VARCHAR(160) NOT NULL,
    group_id INT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(group_id) references groupp(id)
);

create table teacher
(
    id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(160) NOT NULL,
    last_name VARCHAR(160) NOT NULL,
    email VARCHAR(320) NOT NULL,
    PRIMARY KEY(id)
);

create table course
(
    id INT NOT NULL AUTO_INCREMENT,
    course_title VARCHAR(160) NOT NULL,
    id_teacher INT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(id_teacher) references teacher(id)
);

create table marks
(
    id INT NOT NULL AUTO_INCREMENT,
    student_id INT NOT NULL,
    course_id INT NOT NULL,
    mark INT NOT NULL check ( mark > 0 ),
    PRIMARY KEY(id),
    FOREIGN KEY(student_id) references student(id),
    FOREIGN KEY(course_id) references course(id)
);



