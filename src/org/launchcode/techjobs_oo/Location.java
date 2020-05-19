package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Location extends JobField {

    public Location(String value) {
        super(value);
    }

//    @Override
//    public String toString() {
//        return value;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Location)) return false;
//        Location location = (Location) o;
//        return getId() == location.getId();
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }

    public String getValue() {
        if (value == null || value.equals("")) {
            return "Location: Data Not Available";
        } else {
            return "Location: " + value;
        }
    }
}
