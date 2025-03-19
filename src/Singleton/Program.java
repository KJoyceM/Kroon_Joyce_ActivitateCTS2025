package Singleton;

public class Program{

    public static void main(String[] args) {
        Scoala s1;

        s1=Scoala.getInstanta(100000, "Liceul National", 20);
        System.out.println(s1.getNumeScoala());
    }

}