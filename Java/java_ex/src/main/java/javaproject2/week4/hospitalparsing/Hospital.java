package javaproject2.week4.hospitalparsing;

public class Hospital {
    public String getName() {
        return name;
    }

    public String getWebsiteAddr() {
        return websiteAddr;
    }

    public Address getAddress() {
        return address;
    }

    private String name;
    private String websiteAddr;
    private Address address;

    public Hospital(String name, String websiteAddr, Address address) {
        this.name = name;
        this.websiteAddr = websiteAddr;
        this.address = address;
    }
}
