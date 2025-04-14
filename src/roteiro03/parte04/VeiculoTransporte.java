package roteiro03.parte04;

public abstract class VeiculoTransporte {

    private double distancia;

    public VeiculoTransporte(double distancia) {
        this.distancia = distancia;
    }

    public double getDistancia() {
        return distancia;
    }

    public abstract double calcularTarifa();
}
