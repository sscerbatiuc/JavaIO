/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio.model;

import java.io.Serializable;

/**
 *
 * @author sscerbatiuc
 */
public class Employee implements Serializable {
    String name, surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", surname=" + surname + '}';
    }
    
    
    
}
