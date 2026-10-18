import java.util.Date;

public abstract class Expediente {
    protected int id;
    protected String nombre;
    protected Date fechaIngreso;

    public abstract String obtenerCuidadosEspecificos();
}