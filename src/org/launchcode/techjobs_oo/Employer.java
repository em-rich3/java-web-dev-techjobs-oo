package org.launchcode.techjobs_oo;

public class Employer extends JobField {

    public Employer(String value) {
        super(value);
    }

//    @Override
//    public String toString() {
//        return value;
//    }
//
//    @Override
//    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
//        if (this == o) return true;
//        if (!(o instanceof Employer)) return false;
//        Employer employer = (Employer) o;
//        return getId() == employer.getId();
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }

    public String getValue() {
        if (value == null || value.equals("")) {
            return "Employer: Data Not Available";
        } else {
            return "Employer: " + value;
        }
    }
}

