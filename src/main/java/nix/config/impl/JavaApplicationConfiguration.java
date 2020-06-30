package nix.config.impl;

import nix.config.ApplicationConfiguration;
import org.reflections.Reflections;

import java.util.Set;

public class JavaApplicationConfiguration implements ApplicationConfiguration {

    private Reflections scanner;
    public JavaApplicationConfiguration(String packageToScan){
        this.scanner = new Reflections(packageToScan);
    }

    @Override
    public <T> Class<? extends T> getCurrentImplementation(Class<T> type) {
        Set <Class<? extends T>> children = scanner.getSubTypesOf(type);
        if(children.size() != 1){
            throw new RuntimeException("может быть только одна имплементация");
        }

        return children.iterator().next();
    }
}
