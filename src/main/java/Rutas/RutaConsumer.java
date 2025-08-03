package Rutas;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;

public class RutaConsumer extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        restConfiguration()
                .component("netty-http")
                .host("0.0.0.0")
                .port(8080)
                .bindingMode(RestBindingMode.off);

        rest("/ejemploAdaptacion")
                .post()
                .consumes("application/json")
                .to("direct:entradaAdaptacion");
    }
}
