public class Person {
    private String firstName;
    private String lastName;
    private Address address;


    public Person(String firstName, String lastName, Address address)   {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Address getAddress() {
        return this.address;
    }
 @Override
    public String toString() {
     return  "Person {" + lastName + " " + firstName + ", Address=" + address + "} ";
 }
}


