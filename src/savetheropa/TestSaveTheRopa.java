package savetheropa;

import java.util.ArrayList;
import java.util.List;

public class TestSaveTheRopa {
    public static void main(String[] args) {
        GuardaRopas guardaRopas = new GuardaRopas();
        Prenda p1 = new Prenda("Adidas","Remera");
        Prenda p2 = new Prenda("Harrintong","Pantalon");
        Prenda p3 = new Prenda("Legacy","Camisa");
        Prenda p4 = new Prenda("Pampero","Sombrero");
        List<Prenda> prendas = new ArrayList<Prenda>();
        prendas.add(p1);
        prendas.add(p2);
        prendas.add(p3);
        prendas.add(p4);
        System.out.println("Guardaropa nro: " + guardaRopas.guardarPrendas(prendas));
        guardaRopas.mostrarPrendas();
        System.out.println("---------------------------------------------------------");
        Prenda p5 = new Prenda("Nike","Gorra");
        Prenda p6 = new Prenda("Harrintong","Saco");
        Prenda p7 = new Prenda("UnderArmour","Remera");
        Prenda p8 = new Prenda("Puma","Sombrero");
        List<Prenda> prendas2 = new ArrayList<Prenda>();
        prendas2.add(p5);
        prendas2.add(p6);
        prendas2.add(p7);
        prendas2.add(p8);
        System.out.println("Guardaropa nro: " + guardaRopas.guardarPrendas(prendas));
        guardaRopas.mostrarPrendas();
        System.out.println("---------------------------------------------------------");
        guardaRopas.devolverPrenda(1);
        guardaRopas.mostrarPrendas();

    }
}
