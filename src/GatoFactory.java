import java.util.Date;
import java.util.Map;

public class GatoFactory implements ExpedienteFactory {
    @Override
    public Expediente crearExpediente(Map<String, Object> datos) {
        ExpedienteGato e = new ExpedienteGato();
        e.nombre = (String) datos.get("nombre");
        e.fechaIngreso = new Date();
        return e;
    }
}