package roteiro06.parte03;

public class ServicoReserva {
    private Connection connection;

    public ServicoReserva(Connection c) {
        this.connection = c;
        }

    public void criarReserva() {
        this.connection.connect();
        System.out.println("Lógica de negócio para Reserva de Quarto");
    }
}
