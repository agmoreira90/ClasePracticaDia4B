package dakar;

public class SocorristaAuto extends Vehiculo {
    public SocorristaAuto(Integer velocidad, Integer aceleracion, Integer anguloDeGiro, String patente) {
        super(velocidad, aceleracion, anguloDeGiro, patente, 1000, 4);
    }
    public void socorrer(Auto unAuto){
        System.out.println("Socorriendo Auto: " + unAuto.getPatente());
    }
    @Override
    public String toString() {
        return "Socorrista Auto{" + super.toString() + "}";
    }
}
