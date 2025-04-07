/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro01.parte03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 072220040
 */
public class TestePedido {
    
    public static void main(String[] args) {
        
        MysqlConnection connection = new MysqlConnection();
        
        List<String> lista = new ArrayList<>();
        lista.add("Pizza");
        lista.add("Bebida");
        
        PedidoService pedidoService = new PedidoService(connection, lista);
        pedidoService.processarPedido();
    }
    
}
