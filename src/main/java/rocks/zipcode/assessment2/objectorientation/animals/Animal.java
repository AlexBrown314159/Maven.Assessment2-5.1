package rocks.zipcode.assessment2.objectorientation.animals;

import rocks.zipcode.assessment2.objectorientation.Address;
import rocks.zipcode.assessment2.objectorientation.Person;

/**
 * @author leon on 29/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Person` class before attempting this class.
 */
public class Animal {
    Long myId = Long.MIN_VALUE;
    Person myOwner = new Person();

    public Animal() {
    }

    /**
     * @param id - id of animal
     * @param owner - owner of animal
     */
    public Animal(Long id, Person owner) {
        myId = id;
        myOwner = owner;
    }

    public Long getId() {
        Long Q = myId;
        return myId;
    }

    public void setId(Long id) {
        myId = id;
    }

    public Person getOwner() {
        Person Q = myOwner;
        return Q;
    }

    public void setOwner(Person owner) {
        myOwner = owner;
    }

    public Address getAddress() {
        Address Q = new Address();
        return Q;
    }
}
