public class Voluntario extends Usuario implements Observador {

    @Override
    public void actualizar(CasoRescate caso) {
        System.out.println("Notificación para " + getNombre()
            + ": nuevo rescate en " + caso.getUbicacion());
    }
}