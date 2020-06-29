package nix.service;

import nix.exception.CabinetException;

public class CabinetService {

    private boolean existCabinet = true;

    public void isExist(){
        if(existCabinet){
            System.out.println("Кабинет имеется");
        } else{
            throw new CabinetException("Кабинет не имеется");
        }
    }
}
