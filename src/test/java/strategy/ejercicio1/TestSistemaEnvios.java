package strategy.ejercicio1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestSistemaEnvios {


    @DisplayName("Testea el cálculo total de compra con envío Envios Colectivos Sur, destino Capital Federal, peso menor a 30")
    @Test
    public void TestCalculoEnvioColectivosSurDestinoCapitalFederal() {
        Carrito carritoDeCompras = new Carrito(new Cliente("alracnoreb"));
        SistemaEnvios sistemaEnvios = new SistemaEnvios(new FakeProveedorWebDistancias());
        carritoDeCompras.agregarProducto(new ProductoFisico("notebook", 100, 10));
        var destino = Destino.capitalFederal();
        assertEquals(1600, sistemaEnvios.calcularCostoEnvio(EmpresasEnvios.COLECTIVOS_SUR, destino, carritoDeCompras));
    }

    @DisplayName("Testea el cálculo total de compra con envío Envios Colectivos Sur, destino Gran Buenos Aires, peso meyor a 30")
    @Test
    public void TestCalculoEnvioColectivosSurDestinoGranBuenosAires() {
        Carrito carritoDeCompras = new Carrito(new Cliente("alracnoreb"));
        SistemaEnvios sistemaEnvios = new SistemaEnvios(new FakeProveedorWebDistancias());
        carritoDeCompras.agregarProducto(new ProductoFisico("notebooks", 300, 40));
        var destino = Destino.granBuenosAires();
        assertEquals(3800, sistemaEnvios.calcularCostoEnvio(EmpresasEnvios.COLECTIVOS_SUR, destino, carritoDeCompras));
    }

    @DisplayName("Testea el cálculo total de compra con envío Envios Colectivos Sur, Viedma")
    @Test
    public void TestCalculoEnvioColectivosSurDestinoViedma() {
        Carrito carritoDeCompras = new Carrito(new Cliente("alracnoreb"));
        SistemaEnvios sistemaEnvios = new SistemaEnvios(new FakeProveedorWebDistancias());
        carritoDeCompras.agregarProducto(new ProductoFisico("notebooks", 300, 40));
        var destino = Destino.of("viedma");
        assertEquals(5300, sistemaEnvios.calcularCostoEnvio(EmpresasEnvios.COLECTIVOS_SUR, destino, carritoDeCompras));
    }

    @DisplayName("Testea el cálculo total de compra con Envio Argentino, destino distinto a Capital Federal y Gran Buenos Aires ")
    @Test
    public void TestCalculoEnvioArgentinoDestinoViedma() {
        Carrito carritoDeCompras = new Carrito(new Cliente("alracnoreb"));
        SistemaEnvios sistemaEnvios = new SistemaEnvios(new FakeProveedorWebDistancias());
        carritoDeCompras.agregarProducto(new ProductoFisico("notebook", 100, 10));
        var destino = Destino.of("viedma");
        assertEquals(950, sistemaEnvios.calcularCostoEnvio(EmpresasEnvios.ARGENTINO, destino, carritoDeCompras));
    }

    @DisplayName("Testea el cálculo total de compra con Envio Argentino, destino a Capital Federal  ")
    @Test
    public void TestCalculoEnvioArgentinoDestinoCapitalFederal() {
        Carrito carritoDeCompras = new Carrito(new Cliente("alracnoreb"));
        SistemaEnvios sistemaEnvios = new SistemaEnvios(new FakeProveedorWebDistancias());
        carritoDeCompras.agregarProducto(new ProductoFisico("notebook", 100, 10));
        var destino = Destino.capitalFederal();
        assertEquals(600, sistemaEnvios.calcularCostoEnvio(EmpresasEnvios.ARGENTINO, destino, carritoDeCompras));


    }

    @DisplayName("Testea Assert ")
    @Test
    public void TestAssert() {
        Carrito carritoDeCompras = new Carrito(new Cliente("alracnoreb"));
        SistemaEnvios sistemaEnvios = new SistemaEnvios(new FakeProveedorWebDistancias());

        var e = assertThrows(RuntimeException.class, () -> {
            sistemaEnvios.assertTipoEnvioValido(EmpresasEnvios.EMPRESA_X);
        });

        assertEquals("Tipo de envio inexistente", e.getMessage());


    }
}



