package roteiro03.parte01;

public class VeiculoTransporte {
    protected double tarifaBase;

    public VeiculoTransporte(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public double calcularTarifa() {
        return tarifaBase;
    }
}
