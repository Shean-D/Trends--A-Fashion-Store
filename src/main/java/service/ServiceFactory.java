package service;

import service.custom.impl.CalculatorServiceImpl;
import service.custom.impl.CustomerServiceImpl;
import util.ServiceType;

public class ServiceFactory {

    private static ServiceFactory instatnce;

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){

        return instatnce == null ? instatnce = new ServiceFactory() : instatnce;

    }

    public <T extends SuperService> T getService(ServiceType type){

        switch (type){
            case CUSTOMER : return (T) new CustomerServiceImpl();
            case CALCULATOR: return (T) new CalculatorServiceImpl();
        }

        return null;
    }


}
