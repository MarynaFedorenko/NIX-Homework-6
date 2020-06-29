package nix.service;

import nix.data.Patient;
import nix.service.CabinetService;
import nix.service.DoctorResponsibilityService;

public class DoctorService {

    private CabinetService cabinetService = new CabinetService();
    private DoctorResponsibilityService doctorResponsibilityService = new DoctorResponsibilityService();

    public void startAppointment(Patient patient){
        cabinetService.isExist();
        doctorResponsibilityService.startResponsibility(patient);
        treat(patient);
        doctorResponsibilityService.finishResponsibility();
    }

    public void treat (Patient patient){
        System.out.println("Спрашивает о симптомах");
        System.out.println("Проверяет показатели здоровья");
        System.out.println("Прописывает лечение");

    }

}
