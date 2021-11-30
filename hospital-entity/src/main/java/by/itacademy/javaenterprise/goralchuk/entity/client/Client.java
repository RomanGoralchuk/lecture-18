package by.itacademy.javaenterprise.goralchuk.entity.client;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class Client {
    private String name;
    private String surname;
    @Convert(converter = Gender.GenderConverter.class)
    private Gender gender;
    @Temporal(TemporalType.DATE)
    private Date birthday;

    @Override
    public String toString() {
        return ", name='" + name +
                "', surname='" + surname +
                "', gender=" + gender.getCode() +
                ", birthday=" + birthday;
    }
}
