package roteiro06.parte02;

public class ServicoReserva {
    //private MysqlConnection connection;
    private OracleConnection oracleConnection;

    public ServicoReserva() {
        this.oracleConnection = new OracleConnection();
    }

    public void criarReserva() {
        this.oracleConnection.connect();
        System.out.println("Lógica de negócio para Reserva de Quarto");
    }
}
