package by.itacademy.javaenterprise.goralchuk.entity.client;

import by.itacademy.javaenterprise.goralchuk.entity.documents.SickLeave;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
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
    private LifeStatus lifeStatus;

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
