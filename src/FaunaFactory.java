import java.util.Date;
import java.util.Map;

public class FaunaFactory implements ExpedienteFactory {
    @Override
    public Expediente crearExpediente(Map<String, Object> datos) {
        ExpedienteFaunaSilvestre e = new ExpedienteFaunaSilvestre();
        e.nombre = (String) datos.get("nombre");
        e.fechaIngreso = new Date();
        return e;
    }
}