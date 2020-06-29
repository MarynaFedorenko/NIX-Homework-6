package nix;

public class Cabinet {

    private boolean existCabinet = true;

    public void isExist(){
        if(existCabinet){
            System.out.println("Кабинет имеется");
        } else{
            throw new CabinetException("Кабинет не имеется");
        }
    }
}
