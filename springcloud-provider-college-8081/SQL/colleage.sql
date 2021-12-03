CREATE DATABASE student_system_1;
USE student_system_1;
CREATE TABLE college(
    id bigint PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL COMMENT '学院名称',
    status INT NOT NULL DEFAULT 0,
    dbname VARCHAR(255) NOT NULL
);

INSERT INTO college (name, dbname) VALUES ('计算机科学与技术学院', DATABASE());
INSERT INTO college (name, dbname) VALUES ('大数据学院', DATABASE());
INSERT INTO college (name, dbname) VALUES ('电子信息工程学院', DATABASE());
INSERT INTO college (name, dbname) VALUES ('数理学院', DATABASE());

