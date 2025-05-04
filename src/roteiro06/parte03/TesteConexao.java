package roteiro06.parte03;

public class TesteConexao {
    public static void main(String[] args) {

        Connection mysql = new MysqlConnection();
        
        ServicoQuarto quarto = new ServicoQuarto(mysql);
        quarto.verificarQuarto();
        ServicoReserva reserva = new ServicoReserva(mysql);
        reserva.criarReserva();
        RelatorioReserva relatorio = new RelatorioReserva(mysql);
        relatorio.gerarRelatorio();

        //-------------------------------------------------------------------
        System.out.println("-------------------------------------------------");
        //-------------------------------------------------------------------

        Connection o = new OracleConnection();
        
        ServicoQuarto quarto2 = new ServicoQuarto(o);
        quarto2.verificarQuarto();
        ServicoReserva reserva2 = new ServicoReserva(o);
        reserva2.criarReserva();
        RelatorioReserva relatorio2 = new RelatorioReserva(o);
        relatorio2.gerarRelatorio();

        //-------------------------------------------------------------------
        System.out.println("-------------------------------------------------");
        //-------------------------------------------------------------------

        Connection sql = new SqlServerConnection();
        
        ServicoQuarto quarto3 = new ServicoQuarto(sql);
        quarto3.verificarQuarto();
        ServicoReserva reserva3 = new ServicoReserva(sql);
        reserva3.criarReserva();
        RelatorioReserva relatorio3 = new RelatorioReserva(sql);
        relatorio3.gerarRelatorio();
    }
}


/*Caso seja necessario adicionar qualquer novo bando no sistema remodelado, será necessario apenas a implementação de uma nova classe, sem a auteração de nenhum outro código.
 * 
 * O princípio da responsabilidade única é respeitado, com cada classe cumprindo uma função específica. A inversão de dependência se destaca, pois as 
 * classes de serviço dependem da abstração Connection, e não de implementações concretas. O princípio da substituição de Liskov é atendido, 
 * já que todas as conexões podem ser trocadas sem afetar o funcionamento. A interface Connection também respeita a segregação de interfaces por ser simples e focada, 
 * e o sistema segue o princípio aberto/fechado ao permitir extensões sem modificar o código existente.
*/