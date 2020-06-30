package nix;

import nix.data.Patient;
import nix.service.impl.DoctorServiceImpl;

public class Main {

    public static void main(String[] args) {
        DoctorServiceImpl doctorServiceImpl = new DoctorServiceImpl();
        doctorServiceImpl.startAppointment(new Patient());
    }
}
