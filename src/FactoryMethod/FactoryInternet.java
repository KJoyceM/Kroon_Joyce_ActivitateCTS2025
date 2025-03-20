package FactoryMethod;

import FactoryMethod.TelecomFactory;

public class FactoryInternet implements TelecomFactory{

    @Override
    public Abonament creareAbonament(TipAbonament tip) {
        return switch (tip){
            case TipAbonamentInternet.Internet20 -> new Internet20();
            case TipAbonamentInternet.InternetNelimitat -> new InternetNelimitat();
            default -> null;
        };
    }

}
