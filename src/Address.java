public class Address {
    private String city;
    private String street;
    private int house;

    public Address(String city, String street, int house) {
        this.city = city;
        this.street = street;
        this.house = house;
    }

    private String getCity() {
        return this.city;
    }

    private String getStreet() {
        return this.street;
    }

    public int getHouse() {
        return this.house;
    }

    @Override
    public String toString() {
        return city + ", " + street + " " + house;
    }
}
