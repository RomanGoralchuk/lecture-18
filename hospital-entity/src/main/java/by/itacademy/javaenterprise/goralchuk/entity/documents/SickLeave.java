package by.itacademy.javaenterprise.goralchuk.entity.documents;

import by.itacademy.javaenterprise.goralchuk.entity.client.Patient;
import by.itacademy.javaenterprise.goralchuk.entity.personal.Doctor;

import java.util.Date;

public class SickLeave extends Document {
    private Long numberSickLeave;
    private Diagnosis diagnosis;
    private Date startOfTreatment;
    private Date endOfTreatment;
    private Doctor doctor;
    private Patient patient;
}
