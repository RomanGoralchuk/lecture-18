package by.itacademy.javaenterprise.goralchuk.entity.client;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Client {
    private String name;
    private String surname;
    private Gender gender;
    private Date birthday;

    @Override
    public String toString() {
        return ", name='" + name +
                ", surname='" + surname +
                ", gender=" + gender +
                ", birthday=" + birthday;
    }
}
