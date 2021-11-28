package by.itacademy.javaenterprise.goralchuk.entity.client;

import by.itacademy.javaenterprise.goralchuk.entity.documents.ProphylacticLeave;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "prophylactic")
public class Prophylactic extends Client {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prophylacticIdCardNumber;
/*    private ProphylacticLeave prophylacticLeave;*/

    public Prophylactic(String name, String surname, Gender gender, Date birthday, Long prophylacticIdCardNumber, ProphylacticLeave prophylacticLeave) {
        super(name, surname, gender, birthday);
        this.prophylacticIdCardNumber = prophylacticIdCardNumber;
/*        this.prophylacticLeave = prophylacticLeave;*/
    }

    @Override
    public String toString() {
        return "Patient{" +
                "ID=" + prophylacticIdCardNumber +
                super.toString() +
                /*                ", sickLeave=" + sickLeave +*/
                '}';
    }
}
