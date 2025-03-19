package Singleton;

public class Scoala {
    private String numeScoala;
    private int numarClase;
    private float budget;

    private static Scoala instanta= null;

    private Scoala(float budget, String numeScoala, int numarClase) {
        this.budget = budget;
        this.numeScoala = numeScoala;
        this.numarClase = numarClase;
    }

    public String getNumeScoala() {
        return numeScoala;
    }

    public void setNumeScoala(String numeScoala) {
        this.numeScoala = numeScoala;
    }

    public static Scoala getInstanta() {
        return instanta;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public int getNumarClase() {
        return numarClase;
    }

    public void setNumarClase(int numarClase) {
        this.numarClase = numarClase;
    }

    public static Scoala getInstanta(float budget, String numeScoala, int numarClase) {
        if (instanta == null) {
            instanta= new Scoala(budget, numeScoala, numarClase);
        }
        return instanta;
    }
}