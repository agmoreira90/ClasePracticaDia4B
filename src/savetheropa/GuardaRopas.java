package savetheropa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopas {
    private Integer contador = 0;
    private HashMap<Integer, List<Prenda>> diccionario;


    public GuardaRopas() {
        this.diccionario = new HashMap<Integer,List<Prenda>>();
    }

    public Integer guardarPrendas(List<Prenda> listaDePrendas) {
        this.diccionario.put(++contador,listaDePrendas);
        return this.contador;
    }

    public void mostrarPrendas(){
        for ( Map.Entry<Integer,List<Prenda>> guardaRopa : this.diccionario.entrySet()  ) {
            System.out.println("Guardaropa Nro: " + guardaRopa.getKey());
            for (int i = 0; i < guardaRopa.getValue().size(); i++) {
                System.out.println(guardaRopa.getValue().get(i));
            }
        }
    }

    public List<Prenda> devolverPrenda(Integer numero){
        List<Prenda> prendas = this.diccionario.get(numero);
        this.diccionario.remove(numero);
        return prendas;
    }

}
