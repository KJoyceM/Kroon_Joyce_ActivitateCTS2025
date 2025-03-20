package Factory;

public class AbonamentInternet implements Abonament{
    @Override
    public void descriereAbonament() {
        System.out.println("Acest abonament include doar internet");
    }
}
