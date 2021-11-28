package by.itacademy.javaenterprise.goralchuk.entity.documents;

import by.itacademy.javaenterprise.goralchuk.entity.personal.Doctor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class SickLeave extends Document {
    @Id
    private Long numberSickLeave;
    private Diagnosis diagnosis;
    private Date startOfTreatment;
    private Date endOfTreatment;
    private Doctor doctor;
}
