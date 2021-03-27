package martegroupsa;

public class Invitado {
    private String nombre;
    private String email;
    private Integer mesa;

    public Invitado() {
    }

    public Invitado(String nombre, String email, Integer mesa) {
        this.nombre = nombre;
        this.email = email;
        this.mesa = mesa;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMesa() {
        return this.mesa;
    }

    public void setMesa(Integer mesa) {
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "{Nombre: '" + this.nombre + '\'' +
                "Email='" + this.email + '\'' +
                "Mesa=" + this.mesa +'}';
    }
}
