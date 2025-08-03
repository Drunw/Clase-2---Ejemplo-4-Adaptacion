package Rutas;
import org.apache.camel.impl.DefaultCamelContext;

public class MainApp {
    public static void main(String[] args) throws Exception {
        var context = new DefaultCamelContext();
        context.addRoutes(new RutaInicial());
        context.addRoutes(new RutaConsumer());
        context.start();
        System.out.println("Servidor escuchando en http://localhost:8080/ejemplo");
        // Dejar el contexto corriendo
        Thread.sleep(99999999);
        context.stop();
    }
}

