package by.itacademy.javaenterprise.goralchuk.entity.client;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "patient")
public class Patient extends Client {
    @Id
    @Column(name = "id")
    @SequenceGenerator( name = "patientSequence", sequenceName = "PATIENT_SEQUENCE", allocationSize = 1, initialValue = 1)
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "patientSequence")
    private Long patientIdCardNumber;
    @Convert(converter = LifeStatus.LifeStatusConverter.class)
    private LifeStatus lifeStatus = LifeStatus.ALIVE;

    public Patient(String name, String surname, Gender gender, Date birthday, Long patientIdCardNumber, LifeStatus lifeStatus) {
        super(name, surname, gender, birthday);
        this.patientIdCardNumber = patientIdCardNumber;
        this.lifeStatus = lifeStatus;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "ID=" + patientIdCardNumber +
                super.toString() +
                ", lifeStatus=" + lifeStatus.getCode() +
                '}';
    }
}
