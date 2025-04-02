package config;

import com.google.inject.AbstractModule;
import service.custom.CalculatorService;
import service.custom.CustomerService;
import service.custom.impl.CalculatorServiceImpl;
import service.custom.impl.CustomerServiceImpl;

public class AppModul extends AbstractModule {

    @Override
    protected void configure() {

        bind(CalculatorService.class).to(CalculatorServiceImpl.class);
        bind(CustomerService.class).to(CustomerServiceImpl.class);

    }


}
