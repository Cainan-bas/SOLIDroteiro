package roteiro02.parte03;

import java.util.Arrays;

public class TestePedido {
    public static void main(String[] args) {

        // Teste com desconto padrão
        RegraDesconto descontoPadrao = new DescontoPadrao();
        PedidoService pedidoPadrao = new PedidoService(Arrays.asList("Camiseta", "Jaqueta"), descontoPadrao);
        pedidoPadrao.processarPedido();

        // Teste com desconto VIP
        RegraDesconto descontoVIP = new DescontoVIP();
        PedidoService pedidoVIP = new PedidoService(Arrays.asList("Camiseta", "Calça", "Jaqueta"), descontoVIP);
        pedidoVIP.processarPedido();

        // Teste desconto livre
        RegraDesconto descontoLivre = new DescontoLivre(0.15);
        PedidoService pedidoLivre = new PedidoService(Arrays.asList("Camiseta", "Calça", "Jaqueta"), descontoLivre);
        pedidoLivre.processarPedido();
    }
}