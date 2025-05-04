package roteiro05.parte04;

public class NotificacaoService {
    private Notificacao notificacao;

    public NotificacaoService(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public void enviarNotificacao(String mensagem) {
        this.notificacao.enviar(mensagem);
    }
}