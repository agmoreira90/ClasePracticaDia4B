package martegroupsa;

public class InvitadoStandard extends Invitado {


    public InvitadoStandard(String nombre, String email, Integer mesa) {
        super(nombre, email, mesa);
    }


    @Override
    public String toString() {
        return "Invitado Standard'" + '\'' +
                super.toString();
    }
}
