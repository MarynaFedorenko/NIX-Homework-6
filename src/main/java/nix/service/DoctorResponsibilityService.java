package nix.service;

import nix.data.Patient;

public class DoctorResponsibilityService {

    public void startResponsibility(Patient patient){
        System.out.println("Дожидается пациента");
        System.out.println("Спрашивает о симптомах");
    }

    public void finishResponsibility(){
        System.out.println("Прописывает лечение");
    }
}
