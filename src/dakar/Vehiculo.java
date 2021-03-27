package dakar;

public class Vehiculo {
    private Integer velocidad;
    private Integer aceleracion;
    private Integer anguloDeGiro;
    private String patente;
    private Integer peso;
    private Integer rueda;

    public Vehiculo() {
    }

    public Vehiculo(Integer velocidad, Integer aceleracion, Integer anguloDeGiro, String patente, Integer peso, Integer rueda) {
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.anguloDeGiro = anguloDeGiro;
        this.patente = patente;
        this.peso = peso;
        this.rueda = rueda;
    }

    public Integer getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public Integer getAceleracion() {
        return this.aceleracion;
    }

    public void setAceleracion(Integer aceleracion) {
        this.aceleracion = aceleracion;
    }

    public Integer getAnguloDeGiro() {
        return this.anguloDeGiro;
    }

    public void setAnguloDeGiro(Integer anguloDeGiro) {
        this.anguloDeGiro = anguloDeGiro;
    }

    public String getPatente() {
        return this.patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Integer getPeso() {
        return this.peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getRueda() {
        return this.rueda;
    }

    public void setRueda(Integer rueda) {
        this.rueda = rueda;
    }

    @Override
    public String toString() {
        return  "Velocidad=" + velocidad +"- Aceleracion=" + aceleracion + '\'' +
                "AnguloDeGiro=" + anguloDeGiro + "- Patente='" + patente + '\'' +
                "Peso=" + peso +"- Rueda=" + rueda +'}';
    }
}
