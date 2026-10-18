import java.util.Date;
import java.util.Map;

public class PerroFactory implements ExpedienteFactory {
    @Override
    public Expediente crearExpediente(Map<String, Object> datos) {
        ExpedientePerro e = new ExpedientePerro();
        e.nombre = (String) datos.get("nombre");
        e.fechaIngreso = new Date();
        return e;
    }
}