package test_employees.repository;

import test_employees.model.Person;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Repository {
    static Map<Integer, Person> persons = new Hashtable<>();

    static {
        persons.put(1, new Person(1,"Сергей", "Директор"));
        persons.put(2, new Person(2,"Константин", "Бухгалтер"));
        persons.put(3, new Person(3,"Александр", "Водитель"));
    }

    public Person getPersonById(int id) {
        return persons.get(id);
    }

    public Person addPerson(Person p) {
        return persons.put(p.getId(), p);
    }
    public Person deletePersonById(int id) {
        return persons.remove(id);
    }
    public ArrayList<Person> getAllPersons(){
        return new ArrayList(persons.values());
    }
    public Person updatePersonData (Person p){
        Person person = persons.get(p.getId());
        if (null != person) {
            person.setName(p.getName());
            person.setRole(p.getRole());
            persons.put(p.getId(), person);
        }
        return person;
    }
}
