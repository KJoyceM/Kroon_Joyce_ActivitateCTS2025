package Factory;

public class AbonamentInternetVoce implements Abonament{

    @Override
    public void descriereAbonament() {
        System.out.println("Acest abonament include internet si voce");
    }
}
