package Factory;

public class TelecomFactorySingleton {

    private static TelecomFactorySingleton instance = null;

    private TelecomFactorySingleton() {

    }

    public static synchronized TelecomFactorySingleton getInstance() {
        if (instance == null) {
            instance = new TelecomFactorySingleton();
        }
        return instance;
    }

    public Abonament createAbonament(TipAbonament tipAbonament) throws Exception {
        switch (tipAbonament) {
            case abonamentInternet:
                return new AbonamentInternet();
            case abonamentVoce:
                return new AbonamentVoce();
            case abonamentInternetVoce:
                return new AbonamentInternetVoce();
                default:
                    throw new Exception("Invalid Abonament");
        }
    }
}
