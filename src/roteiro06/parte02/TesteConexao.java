package roteiro06.parte02;

public class TesteConexao {
    public static void main(String[] args) {
        
        ServicoQuarto quarto = new ServicoQuarto();
        quarto.verificarQuarto();
        ServicoReserva reserva = new ServicoReserva();
        reserva.criarReserva();
        RelatorioReserva relatorio = new RelatorioReserva();
        relatorio.gerarRelatorio();
    }
}

/* Com a implementação feita na parte 1, uma simples mudança no banco de dados 
(mysql para oracle) afeta todas as classes que utilizam a conexão com o banco, sendo
assim necessário alterar o código de todas as classes que utilizam a conexão com o banco uma a uma.
Tornado assim, uma solução que fere os princípios do SOLID.
*/ 
