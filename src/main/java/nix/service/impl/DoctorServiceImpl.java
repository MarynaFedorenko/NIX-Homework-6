package nix.service.impl;

import nix.data.Patient;
import nix.service.CabinetService;
import nix.service.DoctorResponsibilityService;
import nix.service.DoctorService;

public class DoctorServiceImpl implements DoctorService <Patient> {

    private CabinetService cabinetService = new CabinetServiceImpl();
    private DoctorResponsibilityService doctorResponsibilityService = new DoctorResponsibilityServiceImpl();

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
