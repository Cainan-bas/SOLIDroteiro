/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro01.parte05;

import java.util.List;

/**
 *
 * @author 072220040
 */
public class PedidoService {
    private MysqlConnection connection;
    private CalculadoraPreco calculadora;
    private List<String> itens;
    
    
    public PedidoService(MysqlConnection connection, List<String> itens){
        this.connection = connection;
        this.calculadora = new CalculadoraPreco();
        this.itens = itens;
    }
    
    public void processarPedido(){
        this.connection.connect();
        double total = this.calculadora.calcularTotal(this.itens);
        System.out.println("Pedido processado. Valor total: RS" + total);
    }
    
}
