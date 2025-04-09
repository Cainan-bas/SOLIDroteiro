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
public class CalculadoraPreco {
    
    // public double calcularTotal(List<String> itens) {
    //     double total = 0;
    //     for (String item : itens) {
    //         if (item.equals("Pizza")) {
    //             total += 30.0;
    //         } else if (item.equals("Bebida")) {
    //             total += 10.0;
    //         }
    //     }
    //     return total;
    // }

    public double calcularTotal(List<String> itens){
        double total = 0;
        double desconto = 0;
        for(String item : itens){
            if(item.equals("Pizza")){ 
                total+=30.0; 
                desconto = 0.1;
            }
            else if (item.equals("Bebida")){
                total += 10.0;
                if (desconto != 0)desconto = 0.15;
            }
        }
        
        return total - (total*desconto);
    }
    
}
