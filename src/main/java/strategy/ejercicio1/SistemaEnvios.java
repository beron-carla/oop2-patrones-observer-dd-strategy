package strategy.ejercicio1;

import java.util.HashMap;
import java.util.Map;

enum EmpresasEnvios {
    ARGENTINO,
    COLECTIVOS_SUR,
    EMPRESA_X
}

public class SistemaEnvios {
    private Map<String, CalculadorEnvio> estrategiasCalculo = new HashMap<>();
    private GeneradorDeDistancias generadorDistancias;

    public SistemaEnvios(GeneradorDeDistancias proveedorDeDistancias) {
        this.generadorDistancias = proveedorDeDistancias;
        this.estrategiasCalculo.put(EmpresasEnvios.ARGENTINO.name(), new CalculadorEnviosArgentino(generadorDistancias));
        this.estrategiasCalculo.put(EmpresasEnvios.COLECTIVOS_SUR.name(), new CalculadorEnviosColectivosSur());
    }

    public float calcularCostoEnvio(EmpresasEnvios empresaEnvio, Destino destino, Carrito carritoDeCompras) {
        assertTipoEnvioValido(empresaEnvio);
        return carritoDeCompras.calcularTotalProductos() + this.estrategiasCalculo.get(empresaEnvio.name()).costoEnvio(destino, carritoDeCompras.calcularPesoTotal());
    }


    public void assertTipoEnvioValido(EmpresasEnvios empresaEnvio) {
        if (!this.estrategiasCalculo.containsKey(empresaEnvio.name())) {
            throw new RuntimeException("Tipo de envio inexistente");
        }
    }
}
