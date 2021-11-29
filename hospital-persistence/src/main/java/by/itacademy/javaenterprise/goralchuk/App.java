package by.itacademy.javaenterprise.goralchuk;

import by.itacademy.javaenterprise.goralchuk.dao.impl.PatientDaoImpl;
import by.itacademy.javaenterprise.goralchuk.entity.client.Gender;
import by.itacademy.javaenterprise.goralchuk.entity.client.LifeStatus;
import by.itacademy.javaenterprise.goralchuk.entity.client.Patient;
import by.itacademy.javaenterprise.goralchuk.util.FlywayUtil;
import by.itacademy.javaenterprise.goralchuk.util.HibernateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        EntityManager entityManager = HibernateUtil.getEntityManager();
        try {
            FlywayUtil.cleanMigration();
            FlywayUtil.updateMigration();

            PatientDaoImpl patientDao = new PatientDaoImpl(entityManager);

            patientDao.save(new Patient());
            patientDao.save(new Patient());
            patientDao.save(new Patient());

            Patient patientTest = new Patient();
            patientTest.setName("TestName");
            patientTest.setSurname("TestSurname");
            patientTest.setBirthday(java.sql.Date.valueOf("2000-12-12"));
            patientTest.setGender(Gender.MALE);
            patientTest.setLifeStatus(LifeStatus.ALIVE);

            logger.info(patientTest.toString());
            patientDao.save(patientTest);

            logger.info("{}", patientDao.find(10L));

        } catch (StackOverflowError  e) {
            logger.error(e.getMessage(), e);
        }
        HibernateUtil.close();
    }
}
