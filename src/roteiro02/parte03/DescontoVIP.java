package roteiro02.parte03;

public class DescontoVIP implements RegraDesconto {
    @Override
    public double calcular(double total) {
        return total * 0.8; // 20% de desconto
    }
}
