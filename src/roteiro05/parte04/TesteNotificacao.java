package roteiro05.parte04;

public class TesteNotificacao {
    public static void main(String[] args) {

        Notificacao email = new NotificacaoEmail();
        Notificacao sms = new NotificacaoSMS();
        Notificacao push = new NotificacaoPush();
        Notificacao whatsapp = new NotificacaoWhatsApp();

        NotificacaoService service1 = new NotificacaoService(email);
        NotificacaoService service2 = new NotificacaoService(sms);
        NotificacaoService service3 = new NotificacaoService(push);
        NotificacaoService service4 = new NotificacaoService(whatsapp);
        
        service1.enviarNotificacao("Bem-vindo ao sistema!");
        service2.enviarNotificacao("Seu código de verificação é 1234.");
        service3.enviarNotificacao("Você tem uma nova mensagem.");
        service4.enviarNotificacao("Seu pedido foi enviado com sucesso.");
    }
}

// Foi escolhida a abordagem do roteiro 02, pois mesmo aparentando em primeira análise ser mais complexa, ela é mais flexível e escalável.
