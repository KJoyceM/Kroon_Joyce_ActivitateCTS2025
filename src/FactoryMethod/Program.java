package FactoryMethod;

public class Program {
    public static void main(String[] args) {
        TelecomFactory fabrica= new FactoryInternet();
        TelecomFactory fabricaVoce= new FactoryVoce();

        Abonament abonament= fabrica.creareAbonament(TipAbonamentInternet.Internet20);
        abonament.descriere();
        abonament=fabricaVoce.creareAbonament(TipAbonamentVoce.VocePremium);
        abonament.descriere();
    }
}
