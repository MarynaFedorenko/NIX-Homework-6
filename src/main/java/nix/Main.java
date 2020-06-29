package nix;

import nix.data.Patient;
import nix.service.DoctorService;

public class Main {

    public static void main(String[] args) {
        DoctorService doctorService = new DoctorService();
        doctorService.startAppointment(new Patient());
    }
}
