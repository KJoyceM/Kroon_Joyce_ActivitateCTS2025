package Builder;

public class Program {

    public static void main(String[] args) {
        AbonamentInternet a1= AbonamentInternet.builder().setAreFibraOptica(true).setAre5G(false).
                setAreNelimitat(true).setPret(100).build();

        System.out.println(a1);
    }
}