package com.company;

public class InstituteQuiz <First,Second,Third,Fourth> {
    public First FirstName;
    public Second NationalCode;
    public Third Taraz;
    public Fourth LastName;
    public String EducationString;
    public First getFirstName() {
        return FirstName;
    }

    public void setFirstName(First firstName) {
        FirstName = firstName;
    }

    public Second getNationalCode() {
        return NationalCode;
    }

    public void setNationalCode(Second nationalCode) {
        NationalCode = nationalCode;
    }

    public Third getTaraz() {
        return Taraz;
    }

    public void setTaraz(Third taraz) {
        Taraz = taraz;
    }

    public Fourth getLastName() {
        return LastName;
    }

    public void setLastName(Fourth lastName) {
        LastName = lastName;
    }

    public String getEducationString() {
        return EducationString;
    }

    public void setEducationString(String educationString) {
        EducationString = educationString;
    }
}
