ALTER TABLE patient
ADD (
fullInformation CHAR(100) NULL DEFAULT NULL,
updatedBy DATE NOT NULL,
age INT(10) NULL DEFAULT NULL
);