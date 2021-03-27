package martegroupsa;

import java.util.ArrayList;

public class Evento {
    private ArrayList<Invitado> invitados;
    private ArrayList<FuegoArtificial> fuegosArtificiales;

    public Evento() {
        invitados = new ArrayList<Invitado>();
        fuegosArtificiales = new ArrayList<FuegoArtificial>();
    }

    public Evento(ArrayList<Invitado> invitados, ArrayList<FuegoArtificial> fuegosArtificiales) {
        this.invitados = invitados;
        this.fuegosArtificiales = fuegosArtificiales;
    }

    public ArrayList<Invitado> getInvitados() {
        return this.invitados;
    }

    public void setInvitados(ArrayList<Invitado> invitados) {
        this.invitados = invitados;
    }

    public ArrayList<FuegoArtificial> getFuegosArtificiales() {
        return this.fuegosArtificiales;
    }

    public void setFuegosArtificiales(ArrayList<FuegoArtificial> fuegosArtificiales) {
        this.fuegosArtificiales = fuegosArtificiales;
    }

    public void agregarInvitado(Invitado invitado) {
        this.invitados.add(invitado);
    }

    public void quitarInvitado(String nombre) {
        for (int i = 0; i < this.invitados.size(); i++) {
            if (this.invitados.get(i).getNombre().equals(nombre)) {
                this.invitados.remove(i);
            }
        }
    }

    public void agregarFuegosArtificiales(FuegoArtificial fuegoArtificial) {
        this.fuegosArtificiales.add(fuegoArtificial);
    }

    public void quitarFuegosArtificiales(String nombre) {
        for (int i = 0; i < this.fuegosArtificiales.size(); i++) {
            if (this.fuegosArtificiales.get(i).equals(nombre)) {
                this.fuegosArtificiales.remove(i);
            }
        }
    }

    public void lanzarFuegosArtificiales() {
        for (int i = 0; i < this.fuegosArtificiales.size(); i++) {
                this.fuegosArtificiales.get(i).lanzarFuegos();
        }
    }

    public void partirTorta(){
        for (int i = 0; i < this.invitados.size(); i++) {
            if (InvitadoMeli.class.isInstance(this.invitados.get(i)) == true){
                InvitadoMeli invitadoMeli = (InvitadoMeli) this.invitados.get(i);
                invitadoMeli.comerTorta();
            }
        }
    }

}
