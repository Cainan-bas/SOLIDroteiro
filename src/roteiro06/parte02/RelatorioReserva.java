package roteiro06.parte02;

public class RelatorioReserva {
    //private MysqlConnection connection;
    private OracleConnection oracleConnection;

    public RelatorioReserva() {
        this.oracleConnection = new OracleConnection();
    }

    public void gerarRelatorio() {
        this.oracleConnection.connect();
        System.out.println("Lógica de negócio para geração de Relatório");
    }
}
