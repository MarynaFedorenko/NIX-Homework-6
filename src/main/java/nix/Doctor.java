package nix;

public class Doctor {

    private Cabinet cabinet = new Cabinet();

    public void startAppointment(Patient patient){
        cabinet.isExist();
        System.out.println("Кабинет имеется");
        System.out.println("Дожидается пациента");
        System.out.println("Отвечает на вопросы");
        treat(patient);
        System.out.println("Отвечает на вопросы");
    }

    public void treat (Patient patient){
        System.out.println("Спрашивает о симптомах");
        System.out.println("Проверяет показатели здоровья");
        System.out.println("Прописывает лечение");

    }

}
