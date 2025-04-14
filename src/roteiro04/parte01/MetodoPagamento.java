package roteiro04.parte01;

public interface MetodoPagamento {
    
    void processarPagamento(double valor);

    void gerarFatura();

    void validarSaldo();
}
