package martegroupsa;

public class FuegoArtificialIndividual implements FuegoArtificial{
    private String nombre;
    private String sonido;

    public FuegoArtificialIndividual() {
    }

    public FuegoArtificialIndividual(String sonido, String nombre) {
        this.nombre = nombre;
        this.sonido = sonido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    @Override
    public void lanzarFuegos() {
        System.out.println(this.sonido);
    }
}
