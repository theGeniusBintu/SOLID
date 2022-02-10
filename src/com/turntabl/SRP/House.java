package com.turntabl.SRP;

/** House has one responsibility which is it describes a house**/
public class House {
    private String owner;
    private String name;
    private String location;
    private Integer rooms;


    public String getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public Integer getRooms() {
        return rooms;
    }

    public House(String owner, String name, String location, Integer rooms) {
        this.owner = owner;
        this.name = name;
        this.location = location;
        this.rooms = rooms;

    }


}
