package roteiro06.parte03;

public class RelatorioReserva {
    private Connection connection;

    public RelatorioReserva(Connection c) {
        this.connection = c;
    }

    public void gerarRelatorio() {
        this.connection.connect();
        System.out.println("Lógica de negócio para geração de Relatório");
    }
}
