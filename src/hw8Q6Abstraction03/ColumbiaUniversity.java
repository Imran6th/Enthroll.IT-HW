package hw8Q6Abstraction03;

import hw7Q4Abstraction02.EngineeringSchool;
import hw7Q4Abstraction02.University;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool, Hospital, College,AeronauticalSchool {

    @Override
    public void vocationalInfo() {

    }


    public void commonRoom() {

    }


    public void labratory() {

    }


    public void languageClub() {

    }

    @Override
    public void dorm() {
        super.dorm();
    }

    @Override
    public void morgue() {
        super.morgue();
    }

    @Override
    public void gymnasium() {
        University.super.gymnasium();
    }

    @Override
    public void aeronauticalInfo() {

    }
}
