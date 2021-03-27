package martegroupsa;

import java.util.ArrayList;

public class FuegoArtificialPack implements FuegoArtificial {
    private String nombre;
    private ArrayList<FuegoArtificialIndividual> fuegosArtificiales;
    private FuegoArtificialPack packsFuegosArtificiales;

    public FuegoArtificialPack() {
    }

    public FuegoArtificialPack(String nombre, ArrayList<FuegoArtificialIndividual> fuegosArtificiales, FuegoArtificialPack packsFuegosArtificiales) {
        this.nombre = nombre;
        this.fuegosArtificiales = fuegosArtificiales;
        this.packsFuegosArtificiales = packsFuegosArtificiales;
    }

    public ArrayList<FuegoArtificialIndividual> getFuegosArtificiales() {
        return this.fuegosArtificiales;
    }

    public void setFuegosArtificiales(ArrayList<FuegoArtificialIndividual> fuegosArtificiales) {
        this.fuegosArtificiales = fuegosArtificiales;
    }

    public FuegoArtificialPack getPacksFuegosArtificiales() {
        return this.packsFuegosArtificiales;
    }

    public void setPacksFuegosArtificiales(FuegoArtificialPack packsFuegosArtificiales) {
        this.packsFuegosArtificiales = packsFuegosArtificiales;
    }

    public void agregarFuegoArtificial(FuegoArtificialIndividual fuegoArtificial) {
        this.fuegosArtificiales.add(fuegoArtificial);
    }

    public void quitarFuegoArtificial(String nombre) {
        for (int i = 0; i < this.fuegosArtificiales.size(); i++) {
            if (nombre.equals(this.fuegosArtificiales.get(i).getNombre())) {
                this.fuegosArtificiales.remove(i);
            }
        }
    }

    public void agregarPack(FuegoArtificialPack fuegoArtificialPack) {
        this.packsFuegosArtificiales = fuegoArtificialPack;
    }

    @Override
    public void lanzarFuegos() {
        if (this.packsFuegosArtificiales != null) {
            recorerPack(this.packsFuegosArtificiales);
        }
        for (int i = 0; i < this.fuegosArtificiales.size(); i++) {
            this.fuegosArtificiales.get(i).lanzarFuegos();
        }

    }

    private void recorerPack(FuegoArtificialPack fuegoArtificialPack) {
        if (fuegoArtificialPack.getPacksFuegosArtificiales() != null) {
            recorerPack(fuegoArtificialPack.getPacksFuegosArtificiales());
        }
        for (int i = 0; i < fuegoArtificialPack.getFuegosArtificiales().size(); i++) {
            fuegoArtificialPack.getFuegosArtificiales().get(i).lanzarFuegos();
        }
    }
}
