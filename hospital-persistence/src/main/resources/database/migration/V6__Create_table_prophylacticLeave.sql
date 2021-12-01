CREATE TABLE prophylacticLeave (
    id CHAR(50) NOT NULL,
    idCard CHAR(50) NULL DEFAULT NULL,
    description CHAR(50) NULL DEFAULT NULL,
    PRIMARY KEY (id) USING BTREE
);