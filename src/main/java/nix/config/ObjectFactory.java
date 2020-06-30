package nix.config;

public class ObjectFactory {
    //цель фабрики - самой понимать какую имплементацию использовать для нового интерфейса
    private static ObjectFactory instance;

    private ObjectFactory(){}

    public static ObjectFactory getInstance(){
        if(instance==null) instance = new ObjectFactory();
        return instance;
    }

    public <T> T createObject(Class <T> type){
        return null;
    }
}
