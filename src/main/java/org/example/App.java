package org.example;

import org.example.config.Config;
import org.example.dao.CarDao;
import org.example.dao.PersonDao;
import org.example.entity.Car;
import org.example.entity.Person;

public class App {

    public static void main(String[] args) {
        //Config.getEntityManager();

//        PersonDao personDao = new PersonDao();
//        personDao.savePerson(new Person("Tynchtyk", "Baike", "tyncho@gmail.com", 30));
        CarDao carDao = new CarDao();
        //carDao.saveCar(2L, new Car("Honda", "CR-V", 25000));
        System.out.println(carDao.getCarByPersonId(1L));
    }
}