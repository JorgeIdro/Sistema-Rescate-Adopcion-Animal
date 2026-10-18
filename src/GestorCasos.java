public class GestorCasos implements Sujeto {

    private static GestorCasos instancia;

    private final List<Observador> observadores = new ArrayList<>();
    private CasoRepository repositorio;

    private GestorCasos() { }

    public static synchronized GestorCasos getInstancia() {
        if (instancia == null) {
            instancia = new GestorCasos();
        }
        return instancia;
    }

    public void setRepositorio(CasoRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void registrarCaso(CasoRescate caso) {
        repositorio.guardar(caso);
        notificarObservadores(caso);
    }

    @Override
    public void suscribir(Observador o) { observadores.add(o); }

    @Override
    public void desuscribir(Observador o) { observadores.remove(o); }

    @Override
    public void notificarObservadores(CasoRescate caso) {
        for (Observador o : observadores) {
            o.actualizar(caso);
        }
    }
}