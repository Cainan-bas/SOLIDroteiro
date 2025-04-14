package roteiro03.parte02;

public class Onibus extends VeiculoTransporte {
    private double tarifaBase;

    public Onibus(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    @Override
    public double calcularTarifa() {
        return tarifaBase * 1.2;
    }
}
