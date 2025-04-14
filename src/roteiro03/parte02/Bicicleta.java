package roteiro03.parte02;

public class Bicicleta extends VeiculoTransporte {
    
    @Override
    public double calcularTarifa() {
        return 0; // Agora Bicicleta pode ser tratada como um veículo, sem lançar exceções
    }
}
