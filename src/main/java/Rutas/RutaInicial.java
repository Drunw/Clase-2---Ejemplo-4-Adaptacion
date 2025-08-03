package Rutas;
import Processor.UsuarioAdapter;
import org.apache.camel.builder.RouteBuilder;

public class RutaInicial extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("direct:entradaAdaptacion")
                .log("Entro una peticion: ${body}")
                .unmarshal().json()
                .bean(UsuarioAdapter.class, "adaptar")
                .log("Usuario adaptado: ${body}")
                .end();

    }
}

