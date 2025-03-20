package Prototype;

public class Program {
    public static void main(String[] args) {
        IListaAbonamente listaAbonamente = new ListaAbonamente();
        listaAbonamente.loadListaAbonamente();

        IListaAbonamente copyListaAbonamente= null;
        copyListaAbonamente = listaAbonamente.copy();

        System.out.println(copyListaAbonamente.toString());
    }
}
