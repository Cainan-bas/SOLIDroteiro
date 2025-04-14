package roteiro03.parte01;

public class TesteTransporte {
    public static void main(String[] args) {
        VeiculoTransporte onibus = new Onibus(5.00);
        System.out.println("Tarifa Ônibus: R$ " + onibus.calcularTarifa());

        try {
            VeiculoTransporte bicicleta = new Bicicleta();
            System.out.println("Tarifa Bicicleta: R$ " + bicicleta.calcularTarifa());
        } catch (UnsupportedOperationException e) {
            System.out.println("Bicicletas não têm tarifa, então ignoramos esse cálculo.");
        }
    }
}
