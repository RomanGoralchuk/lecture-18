CREATE TABLE patient (
	id BIGINT NOT NULL,
	name CHAR(50) NULL DEFAULT NULL,
	surname CHAR(50) NULL DEFAULT NULL,
	gender CHAR(50) NULL DEFAULT NULL,
	birthday DATE NULL DEFAULT NULL,
	life_status CHAR(50) NOT NULL,
	PRIMARY KEY (id) USING BTREE
);