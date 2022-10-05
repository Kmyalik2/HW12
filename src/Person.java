public class Person {
    private String firstName;
    private String lastName;
    private Address address;


    public Person(String firstName, String lastName, Address address)   {
        if (firstName == null || lastName == null || address == null){
        try {
            throw new NullPointerException("Person instance fields cannot be empty");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
        else {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
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
        return lastName.toUpperCase() + " " + firstName + ", Address=" + getAddress();
    }
}


