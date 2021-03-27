package martegroupsa;

import java.util.ArrayList;

public class TestMarteGroupSA {
    public static void main(String[] args) {
        Invitado im1 = new InvitadoMeli("nombre1","a@a.com",1);
        Invitado im2 = new InvitadoMeli("nombre2","b@a.com",1);
        Invitado is1 = new InvitadoStandard("nombre3","c@a.com",3);
        Invitado is2 = new InvitadoStandard("nombre4","d@a.com",2);
        Invitado is3 = new InvitadoStandard("nombre5","e@a.com",2);

        Evento evento = new Evento();

        evento.agregarInvitado(im1);
        evento.agregarInvitado(im2);
        evento.agregarInvitado(is1);
        evento.agregarInvitado(is2);
        evento.agregarInvitado(is3);

        FuegoArtificialIndividual fuegoArtificial = new FuegoArtificialIndividual("pium","fuego");
        FuegoArtificialIndividual fuegoArtificial1 = new FuegoArtificialIndividual("pium pium","fuego1");
        FuegoArtificialIndividual fuegoArtificial2 = new FuegoArtificialIndividual("pium pium pium","fuego2");
        FuegoArtificialIndividual fuegoArtificial3 = new FuegoArtificialIndividual("pium pium pium pium","fuego3");
        FuegoArtificialIndividual fuegoArtificial4 = new FuegoArtificialIndividual("pium pium pium pium pium","fuego4");
        FuegoArtificialIndividual fuegoArtificial5 = new FuegoArtificialIndividual("pium pium pium pium pium pium","fuego5");
        FuegoArtificialIndividual fuegoArtificial6 = new FuegoArtificialIndividual("pium pium pium pium pium pium pium","fuego6");
        FuegoArtificialIndividual fuegoArtificial7 = new FuegoArtificialIndividual("pium pium pium pium pium pium pium pium","fuego7");
        FuegoArtificialIndividual fuegoArtificial8 = new FuegoArtificialIndividual("pium pium pium pium pium pium pium pium pium","fuego8");
        FuegoArtificialIndividual fuegoArtificial9 = new FuegoArtificialIndividual("pium pium pium pium pium pium pium pium pium pium","fuego9");
        FuegoArtificialIndividual fuegoArtificial10 = new FuegoArtificialIndividual("pium pium pium pium pium pium pium pium pium pium pium","fuego10");
        FuegoArtificialIndividual fuegoArtificial11 = new FuegoArtificialIndividual("pium pium pium pium pium pium pium pium pium pium pium pium","fuego11");
        FuegoArtificialIndividual fuegoArtificial12 = new FuegoArtificialIndividual("pium pium pium pium pium pium pium pium pium pium pium pium pium","fuego12");

        ArrayList<FuegoArtificialIndividual> fuegos = new ArrayList<>();
        fuegos.add(fuegoArtificial);
        fuegos.add(fuegoArtificial1);
        FuegoArtificialPack fuegoArtificial13 = new FuegoArtificialPack("pack1",fuegos,null);

        fuegos = new ArrayList<FuegoArtificialIndividual>();
        fuegos.add(fuegoArtificial2);
        fuegos.add(fuegoArtificial3);
        fuegos.add(fuegoArtificial4);

        FuegoArtificialPack fuegoArtificial14 = new FuegoArtificialPack("pack2",fuegos, fuegoArtificial13);

        fuegos = new ArrayList<FuegoArtificialIndividual>();
        fuegos.add(fuegoArtificial5);
        fuegos.add(fuegoArtificial6);
        FuegoArtificialPack fuegoArtificial15 = new FuegoArtificialPack("pack3",fuegos,fuegoArtificial14);

        fuegos = new ArrayList<FuegoArtificialIndividual>();
        fuegos.add(fuegoArtificial7);
        fuegos.add(fuegoArtificial8);
        FuegoArtificialPack fuegoArtificial16 = new FuegoArtificialPack("pack4",fuegos,fuegoArtificial15);

        evento.agregarFuegosArtificiales(fuegoArtificial9);
        evento.agregarFuegosArtificiales(fuegoArtificial10);
        evento.agregarFuegosArtificiales(fuegoArtificial11);
        evento.agregarFuegosArtificiales(fuegoArtificial12);

        evento.agregarFuegosArtificiales(fuegoArtificial13);

        evento.agregarFuegosArtificiales(fuegoArtificial14);

        evento.agregarFuegosArtificiales(fuegoArtificial15);
        evento.agregarFuegosArtificiales(fuegoArtificial16);

        evento.lanzarFuegosArtificiales();

        evento.partirTorta();







    }
}
