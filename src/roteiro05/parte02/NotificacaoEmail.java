package roteiro05.parte02;

public class NotificacaoEmail implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);
    }
}