package roteiro06.parte03;

public class ServicoQuarto {
    private Connection connection;  

    public ServicoQuarto(Connection c) {
        this.connection = c;
    }

    public void verificarQuarto() {
        this.connection.connect();
        System.out.println("Lógica de negócio para o Serviço de Quarto");
    }
}