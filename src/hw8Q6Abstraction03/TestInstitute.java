package hw8Q6Abstraction03;

public class TestInstitute {

    public static void main(String[] args) {
        ColumbiaUniversity cv=new ColumbiaUniversity();
        cv.vocationalInfo();
        cv.gymnasium();
        cv.dorm();
        cv.morgue();

        RockefellerUniversity rv=new RockefellerUniversity();
        rv.aeronauticalInfo();
        rv.gymnasium();
        rv.dorm();
        rv.morgue();

        Hospital hc=new ColumbiaUniversity();
        hc.morgue();

        MedicalSchool ms=new ColumbiaUniversity();
        ms.dorm();
        ms.gymnasium();
        ms.morgue();

        

    }
        }




