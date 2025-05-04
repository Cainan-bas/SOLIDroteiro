package roteiro05.parte01;

public class NotificacaoService {
    public void enviarNotificacaoEmail(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);
    }

    public void enviarNotificacaoSMS(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }

    public void enviarNotificacaoPush(String mensagem) {
        System.out.println("Enviando Push Notification: " + mensagem);
    }
}
