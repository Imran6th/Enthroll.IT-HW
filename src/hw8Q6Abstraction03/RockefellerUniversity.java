package hw8Q6Abstraction03;

import hw7Q4Abstraction02.NYUniversity;
import hw7Q4Abstraction02.NursingSchool;

public class RockefellerUniversity extends NursingSchool implements AeronauticalSchool, College, Hospital, University,VocationalSchool {

    @Override
    public void aeronauticalInfo() {

    }

    @Override
    public void commonRoom() {

    }

    @Override
    public void labratory() {

    }

    @Override
    public void languageClub() {

    }

    @Override
    public void vocationalInfo() {

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
        super.gymnasium();
    }
}
