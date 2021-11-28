package by.itacademy.javaenterprise.goralchuk;

import by.itacademy.javaenterprise.goralchuk.dao.impl.PatientDaoImpl;
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
            patientDao.save(new Patient());

        } catch (StackOverflowError  e) {
            logger.error(e.getMessage(), e);
        }
        HibernateUtil.close();
    }
}
