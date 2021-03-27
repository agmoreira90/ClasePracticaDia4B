package dakar;

import java.util.ArrayList;

public class Carrera {
    private Integer distancia;
    private double premioEnDolares;
    private String nombre;
    private Integer cantidadDeVehiculosPermitidos;
    private ArrayList<Vehiculo> listaVehiculos;
    private SocorristaAuto socorristaAuto;
    private SocorristaMoto socorristaMoto;

    public Carrera() {
    }

    public Carrera(Integer distancia, double premioEnDolares, String nombre, Integer cantidadDeVehiculosPermitidos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.socorristaAuto = new SocorristaAuto(220, 100, 90, "SCK 2594");
        this.socorristaMoto = new SocorristaMoto(180, 60, 30, "SCK 2583");
    }

    public Integer getDistancia() {
        return this.distancia;
    }

    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }

    public double getPremioEnDolares() {
        return this.premioEnDolares;
    }

    public void setPremioEnDolares(double premioEnDolares) {
        this.premioEnDolares = premioEnDolares;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidadDeVehiculosPermitidos() {
        return this.cantidadDeVehiculosPermitidos;
    }

    public void setCantidadDeVehiculosPermitidos(Integer cantidadDeVehiculosPermitidos) {
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return this.listaVehiculos;
    }

    public void darDeAltaAuto(Integer velocidad, Integer aceleracion, Integer anguloDeGiro, String patente) {
        Vehiculo v = new Auto(velocidad, aceleracion, anguloDeGiro, patente);
        if (this.cantidadDeVehiculosPermitidos > listaVehiculos.size()) {
            this.listaVehiculos.add(v);
        }
    }

    public void darDeAltaMoto(Integer velocidad, Integer aceleracion, Integer anguloDeGiro, String patente) {
        Vehiculo v = new Moto(velocidad, aceleracion, anguloDeGiro, patente);
        if (this.cantidadDeVehiculosPermitidos > listaVehiculos.size()) {
            this.listaVehiculos.add(v);
        }
    }

    public void eliminarVehiculo(Vehiculo v) {
        for (int i = 0; i < this.listaVehiculos.size(); i++) {
            if (v.equals(this.listaVehiculos.get(i))) {
                this.listaVehiculos.remove(i);
                break;
            }
        }
    }

    public void eliminarVehiculo(String patente) {
        for (int i = 0; i < this.listaVehiculos.size(); i++) {
            if (patente.equals(this.listaVehiculos.get(i).getPatente())) {
                this.listaVehiculos.remove(i);
                break;
            }
        }
    }

    public void socorrerAuto(String patente) {
        for (int i = 0; i < this.listaVehiculos.size(); i++) {
            if (patente.equals(this.listaVehiculos.get(i).getPatente())) {
                this.socorristaAuto.socorrer((Auto) this.listaVehiculos.get(i));
            }
        }
    }

    public void socorrerMoto(String patente) {
        for (int i = 0; i < this.listaVehiculos.size(); i++) {
            if (patente.equals(this.listaVehiculos.get(i).getPatente())) {
                this.socorristaMoto.socorrer((Moto) this.listaVehiculos.get(i));
            }
        }
    }

    public Vehiculo ganador() {
        Vehiculo vGanador = null;
        for (int i = 0; i < this.listaVehiculos.size(); i++) {
            if (i == 0) {
                vGanador = this.listaVehiculos.get(i);
            } else {
                if (calcularPuntaje(vGanador) < calcularPuntaje(this.listaVehiculos.get(i))) {
                    vGanador = this.listaVehiculos.get(i);
                }
            }
        }
        return vGanador;
    }

    public double calcularPuntaje(Vehiculo v) {
        return (v.getVelocidad() * (v.getAceleracion() / 2)) / (v.getAnguloDeGiro() * (v.getPeso() - v.getRueda() * 100));
    }


    @Override
    public String toString() {
        return "Carrera{" + "Distancia=" + distancia + "- PremioEnDolares=" + premioEnDolares + '\'' +
                "Nombre='" + nombre + ", Cantidad De Vehiculos Permitidos=" + cantidadDeVehiculosPermitidos + '\'' +
                "listaVehiculos=" + listaVehiculos + '}';
    }
}
