/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khyati
 */
public class PersonDirectory {

    List<Person> personList;
    private static PersonDirectory persondirectory;

    public static PersonDirectory getInstance() {
        if (persondirectory == null) {
            persondirectory = new PersonDirectory();
        }
        return persondirectory;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public PersonDirectory() {
        personList = new ArrayList<Person>();
    }

    public Person addPerson() {
        Person ch = new Person();
        personList.add(ch);
        return ch;
    }

    public void removePerson(Person ch) {
        personList.remove(ch);
    }

}
