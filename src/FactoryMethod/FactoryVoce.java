package FactoryMethod;

public class FactoryVoce implements TelecomFactory{
    @Override
    public Abonament creareAbonament(TipAbonament tip){
        return switch (tip){
            case TipAbonamentVoce.VocePremium -> new VocePremium();
            case TipAbonamentVoce.VoceStandard -> new VoceStandard();
            default -> null;
        };
    }
}
