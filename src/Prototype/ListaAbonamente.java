package Prototype;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class ListaAbonamente implements IListaAbonamente{
    private List<String> abonamente;

    //setter
    public void setAbonamente(List<String> abonamente) {
        this.abonamente = abonamente;
    }

    //constructor
    public ListaAbonamente() {
        abonamente = new ArrayList<String>();
    }

    @Override
    public void loadListaAbonamente() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("abonamente"));
            String abonament= null;
            while((abonament=reader.readLine())!=null){
                abonamente.add(abonament);
            }
        }
            catch (FileNotFoundException e){
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }


    @Override
    public IListaAbonamente copy(){
        ListaAbonamente lista = new ListaAbonamente();
        List<String> listaTemporara= new ArrayList<String>();
        for(String abonament: this.abonamente){
            listaTemporara.add(abonament);
        }
        lista.setAbonamente(listaTemporara);

        return lista;
    }

    @Override
    public String toString() {
        return "ListaAbonamente{" + "abonamente=" + abonamente + '}';
    }
}
