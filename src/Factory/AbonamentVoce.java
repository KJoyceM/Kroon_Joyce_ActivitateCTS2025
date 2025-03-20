package Factory;

public class AbonamentVoce implements Abonament{
    @Override
    public void descriereAbonament() {
        System.out.println("Acest abonament include doar voce");
    }
}
