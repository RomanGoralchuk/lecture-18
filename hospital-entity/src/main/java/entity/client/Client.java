package entity.client;

import entity.client.util.Gender;

import java.util.Date;

public abstract class Client {
    private Long idCardClient;
    private String name;
    private String surname;
    private Gender gender;
    private Date birthday;
}
