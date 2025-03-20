package FactoryMethod;

import Factory.AbonamentInternetVoce;

public interface TelecomFactory {
    Abonament creareAbonament(TipAbonament tip);
}
