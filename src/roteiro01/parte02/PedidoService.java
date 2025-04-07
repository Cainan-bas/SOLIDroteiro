/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro01.parte02;

import java.util.List;

/**
 *
 * @author 072220040
 */
public class PedidoService {
    private MysqlConnection connection;
    private List<String> itens;
    
    
    public PedidoService(MysqlConnection connection, List<String> itens){
        this.connection = connection;
        this.itens = itens;
    }
    
    public void processarPedido(){
        this.connection.connect();
        double total = calcularTotal();
        System.out.println("Pedido processado. Valor total: RS" + total);
    }
    
    private double calcularTotal(){
        double total = 0;
        for(String item : itens){
            if(item.equals("Pizza")) total+=30.0;
            else if (item.equals("Bebida")) total += 10.0;
        }
        return total;
    }
    
}
