package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    Long myId = Long.MIN_VALUE;
    String myName = "";
    Address myAddress;

    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        myId = id;
        String myName = name;
        Address myAddress = address;

    }

    public Person() {
    }

    public Long getId() {
        Long Q = myId;
        return Q;
    }

    public void setId(Long id) {
        myId = id;
    }

    public String getName() {
        String Q = myName;
        return Q;
    }

    public void setName(String name) {
        myName = name;
    }

    public Address getAddress() {
        Address Q = myAddress;
        return Q;
    }

    public void setAddress(Address address) {
        myAddress = address;
    }

    @Override
    public boolean equals(Object o) {
        return (Boolean)null;
    }
}