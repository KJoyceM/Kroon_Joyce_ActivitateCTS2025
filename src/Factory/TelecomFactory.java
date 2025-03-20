package Factory;

public class TelecomFactory {

    public Abonament createAbonament(TipAbonament tipAbonament) throws Exception{
        switch (tipAbonament){
            case abonamentVoce:
                return new AbonamentVoce();
                case abonamentInternetVoce:
                    return new AbonamentInternetVoce();
            case abonamentInternet:
                return new AbonamentInternet();
                default:
                    throw new Exception("Tipul primit nu este corect");
        }
    }
}
