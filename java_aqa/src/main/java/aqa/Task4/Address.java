package aqa.Task4;

import java.io.Serializable;

class Address implements Serializable {
    private String city;
    private String state;
    private int zip;

    public void setCity(String city) { this.city = city; }
    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
    public int getZip() { return zip; }
    public void setZip(int zip) { this.zip = zip; }

    @Override
    public String toString() {
        return city + ", " + state + " " + zip;
    }
}
