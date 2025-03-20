package Factory;

public class Program {
    public static void main(String[] args) {
        TelecomFactory telecomFactory = new TelecomFactory();
        Abonament abonament= null;
        try{
            abonament= telecomFactory.createAbonament(TipAbonament.abonamentInternet);
        } catch (Exception e){
            e.printStackTrace();
        }
        abonament.descriereAbonament();
    }
}