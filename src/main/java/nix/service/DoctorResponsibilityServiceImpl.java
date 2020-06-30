package nix.service;

import nix.data.Patient;

public class DoctorResponsibilityServiceImpl  implements DoctorResponsibilityService{
    @Override
    public void startResponsibility(Patient patient){
        System.out.println("Дожидается пациента");
        System.out.println("Спрашивает о симптомах");
    }
    @Override
    public void finishResponsibility(){
        System.out.println("Прописывает лечение");
    }
}
