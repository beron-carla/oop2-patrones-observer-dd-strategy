package strategy.ejercicio1;

public class FakeProveedorWebDistancias implements GeneradorDeDistancias {
    @Override
    public int calcularDistancia(Destino destino) {
        return 10;
    }
}
