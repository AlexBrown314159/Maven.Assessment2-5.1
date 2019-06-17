package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 */
public class Address {
    String a1 = "";
    String a2 = "";
    String c1 = "";
    String s1 = "";
    String z1 = "";


    public Address() {

    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {

        a1 = addressLine1;
        a2 = addressLine2;
        c1 = city;
        s1 = state;
        z1 = zipcode;

    }


    public String getAddressLine1() {
        String q = a1;
        return q;
    }

    public void setAddressLine1(String addressLine1) {
        this.a1 = addressLine1;
    }

    public String getAddressLine2() {
        String q=a2;
        return q;
    }

    public void setAddressLine2(String addressLine2) {
        this.a2 = addressLine2;
    }

    public String getCity() {
        String q=c1;
        return q;
    }

    public void setCity(String city) {
        this.c1 = city;
    }

    public String getState() {
        String q=s1;
        return q;
    }

    public void setState(String state) {
        this.s1 = state;
    }

    public String getZipcode() {
        String q=z1;
        return q;
    }

    public void setZipcode(String zipcode) {
        this.z1 = zipcode;

    }

    @Override
    public boolean equals(Object o) {
        return (Boolean)null;
    }
}
