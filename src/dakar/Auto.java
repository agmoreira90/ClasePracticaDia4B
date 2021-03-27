package dakar;

public class Auto extends Vehiculo{
    public Auto(Integer velocidad, Integer aceleracion, Integer anguloDeGiro, String patente) {
        super(velocidad, aceleracion, anguloDeGiro, patente, 1000, 4);
    }
    @Override
    public String toString() {
        return "Auto{"+super.toString()+"}";
    }
}
