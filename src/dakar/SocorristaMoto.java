package dakar;

public class SocorristaMoto extends Vehiculo {
    public SocorristaMoto(Integer velocidad, Integer aceleracion, Integer anguloDeGiro, String patente) {
        super(velocidad, aceleracion, anguloDeGiro, patente, 300, 2);
    }

    public void socorrer(Moto unaMoto) {
        System.out.println("Socorriendo a Moto: " + unaMoto.getPatente());
    }

    @Override
    public String toString() {
        return "Socorrista Moto{" + super.toString() + "}";
    }
}
