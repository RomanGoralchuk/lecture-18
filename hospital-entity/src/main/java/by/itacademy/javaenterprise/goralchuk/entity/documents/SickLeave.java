package by.itacademy.javaenterprise.goralchuk.entity.documents;

import by.itacademy.javaenterprise.goralchuk.entity.client.Gender;
import by.itacademy.javaenterprise.goralchuk.entity.personal.Doctor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@ToString(callSuper=true)
public class SickLeave extends Document {
    @Id
    private Long numberSickLeave;
    @Convert(converter = Diagnosis.DiagnosisConverter.class)
    private Diagnosis diagnosis;
    private Date startOfTreatment;
    private Date endOfTreatment;
}
