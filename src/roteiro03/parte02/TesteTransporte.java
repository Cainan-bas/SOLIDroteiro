package roteiro03.parte02;

public class TesteTransporte {
    public static void main(String[] args) {

        VeiculoTransporte veiculo1 = new Onibus(5.00); 
        VeiculoTransporte veiculo2 = new Bicicleta(); // Agora é um VeiculoTransporte válido

        System.out.println("Tarifa Ônibus: R$ " + veiculo1.calcularTarifa()); 
        System.out.println("Tarifa Bicicleta: R$ " + veiculo2.calcularTarifa()); // Agora não quebra o código
    }
}
