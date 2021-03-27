package martegroupsa;

public class InvitadoMeli extends Invitado{

    public InvitadoMeli() {
    }

    public void comerTorta(){
        System.out.println("Viva la Chiqui");
    }

    public InvitadoMeli(String nombre, String email, Integer mesa) {
        super(nombre, email, mesa);
    }
    @Override
    public String toString() {
        return "Invitado MELI'" + '\'' +
                super.toString();
    }
}
