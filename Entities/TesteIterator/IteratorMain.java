package Entities.TesteIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMain {
    
    public static void main(String[] args) {
        
        ArrayList<Object> lista = new ArrayList<>();
        Cachorro cachorro1 = new Cachorro("Tobi", 3, "Pincher");
        Cachorro cachorro2 = new Cachorro("Mendel", 2, "Golden");

        Pessoa pessoa1 = new Pessoa("João", 17, 100000);
        Pessoa pessoa2 = new Pessoa("Eliel", 17, 717147);

        lista.add(cachorro1);
        lista.add(pessoa1);

        Iterator<Object> it = lista.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
