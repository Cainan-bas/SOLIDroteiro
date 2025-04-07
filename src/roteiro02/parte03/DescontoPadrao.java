package roteiro02.parte03;


public class DescontoPadrao implements RegraDesconto {
    @Override
    public double calcular(double total) {
        return total * 0.9; // 10% de desconto
    }
}