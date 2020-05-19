package org.launchcode.techjobs_oo;

import java.util.Objects;

public class CoreCompetency extends JobField {

    public CoreCompetency(String value) {
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
//        if (!(o instanceof CoreCompetency)) return false;
//        CoreCompetency that = (CoreCompetency) o;
//        return id == that.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }

    public String getValue() {
        if (value == null || value.equals("")) {
            return "Core Competency: Data Not Available";
        } else {
            return "Core Competency: " + value;
        }
    }
}
