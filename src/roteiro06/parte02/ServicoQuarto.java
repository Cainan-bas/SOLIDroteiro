package roteiro06.parte02;

public class ServicoQuarto {
    //private MysqlConnection connection;
    private OracleConnection oracleConnection;  

    public ServicoQuarto() {
        this.oracleConnection = new OracleConnection();
    }

    public void verificarQuarto() {
        this.oracleConnection.connect();
        System.out.println("Lógica de negócio para o Serviço de Quarto");
    }
}