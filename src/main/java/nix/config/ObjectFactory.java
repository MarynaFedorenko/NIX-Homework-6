package nix.config;

import nix.config.impl.JavaApplicationConfiguration;
import nix.service.CabinetService;
import nix.service.impl.WorkProcessServiceImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class ObjectFactory {
    //цель фабрики - самой понимать какую имплементацию использовать для нового интерфейса
    private static ObjectFactory instance;
    private ApplicationConfiguration config;

    private ObjectFactory(){
        config = new JavaApplicationConfiguration("nix",
                new HashMap<>(Map.of(CabinetService.class, WorkProcessServiceImpl.class)));
    }

    public static ObjectFactory getInstance(){
        if(instance==null) instance = new ObjectFactory();
        return instance;
    }

    public <T> T createObject(Class <T> type){
        Class<? extends T> implClass = type;
        if(type.isInterface()){
            implClass = config.getCurrentImplementation(type);
        }
        T t = null;
        try {
            t = implClass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException("невозможно создать класс: " + e.getClass().getName() + " " + ",msg: " + e.getMessage());
        }


        return t;
    }
}
