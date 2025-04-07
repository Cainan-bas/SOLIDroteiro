package roteiro02.parte02;

import java.util.Arrays;

public class TestePedido {
    public static void main(String[] args) { 
 

        RegraDesconto regraDesconto = new DescontoLivre(0.1);

        PedidoService pedido = new PedidoService(Arrays.asList("Camiseta", "Calça", "Jaqueta"), regraDesconto);
        pedido.processarPedido(0.1);

        /////////////////////////////////////////////////////////////////////////////

        RegraDesconto regraDesconto2 = new DescontoLivre(0.4);

        PedidoService pedido2 = new PedidoService(Arrays.asList("Camiseta", "Calça", "Jaqueta"), regraDesconto2);
        pedido2.processarPedido(0.4);

        /////////////////////////////////////////////////////////////////////////////

        RegraDesconto regraDesconto3 = new DescontoLivre(0.0);

        PedidoService pedido3 = new PedidoService(Arrays.asList("Camiseta", "Calça", "Jaqueta"), regraDesconto3);
        pedido3.processarPedido(0.4);
        
        
    }
}
