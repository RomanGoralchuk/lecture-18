package by.itacademy.javaenterprise.goralchuk.entity.client;

import by.itacademy.javaenterprise.goralchuk.entity.documents.SickLeave;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "patient")
public class Patient extends Client {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientIdCardNumber;
/*    @OneToMany
    private SickLeave sickLeave;*/
    private LifeStatus lifeStatus;

    public Patient(String name, String surname, Gender gender, Date birthday, Long patientIdCardNumber, SickLeave sickLeave, LifeStatus lifeStatus) {
        super(name, surname, gender, birthday);
        this.patientIdCardNumber = patientIdCardNumber;
/*        this.sickLeave = sickLeave;*/
        this.lifeStatus = lifeStatus;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "ID=" + patientIdCardNumber +
                super.toString() +
/*                ", sickLeave=" + sickLeave +*/
                ", lifeStatus=" + lifeStatus +
                '}';
    }
}
