/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author sscerbatiuc
 */
public class Employee implements Serializable {

    String name, surname;
    LocalDate employeedOn;
    Integer age;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, LocalDate employeedOn, Integer age) {
        this(name, surname);
        this.employeedOn = employeedOn;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getEmployeedOn() {
        return employeedOn;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", surname=" + surname + '}';
    }

    public static Employee getRandomEmployee() {
        Random rnd = new Random();
        int randValue = rnd.nextInt();
        return new Employee("name" + randValue, "surname" + randValue, LocalDate.now(), randValue);
    }

}
