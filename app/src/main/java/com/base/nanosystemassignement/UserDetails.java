package com.base.nanosystemassignement;
public class UserDetails {
    private String profileName;
    private String contact;
    private String address;

    private String location ;

    public UserDetails(String profileName, String contact, String address, String location) {
        this.profileName = profileName;
        this.contact = contact;
        this.address = address;
        this.location = location;
    }

    public String getProfileName() {
        return profileName;
    }

    public String getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }


    public String getLocation() {
        return location;
    }

    public UserDetails(){}





}