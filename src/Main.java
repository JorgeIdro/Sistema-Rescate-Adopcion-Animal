import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Object> datos = new HashMap<>();
        datos.put("nombre", "Firulais");

        ExpedienteFactory fabrica = new PerroFactory();
        Expediente exp = fabrica.crearExpediente(datos);
        System.out.println(exp.obtenerCuidadosEspecificos());
    }
}