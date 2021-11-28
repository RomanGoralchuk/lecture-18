CREATE TABLE patient (
    id INT(11)  NOT NULL AUTO_INCREMENT,
    name CHAR(50) NULL DEFAULT NULL,
    surname CHAR(50) NULL DEFAULT NULL,
    gender CHAR(50) NULL DEFAULT NULL,
    birthday DATE NULL DEFAULT NULL,
    sickLeave INT(11) NULL DEFAULT NULL,
    lifeStatus CHAR(50) NULL DEFAULT 'alive' COLLATE 'utf8mb4_general_ci',
    PRIMARY KEY (id)
);

CREATE TABLE prophylactic (
    id INT(11)  NOT NULL AUTO_INCREMENT,
    name CHAR(50) NULL DEFAULT NULL,
    surname CHAR(50) NULL DEFAULT NULL,
    gender CHAR(50) NULL DEFAULT NULL,
    birthday DATE NULL DEFAULT NULL,
    prophylacticLeave INT(11) NULL DEFAULT NULL,
    PRIMARY KEY (id)
);