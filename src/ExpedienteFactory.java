import java.util.Map;

public interface ExpedienteFactory {
    Expediente crearExpediente(Map<String, Object> datos);
}