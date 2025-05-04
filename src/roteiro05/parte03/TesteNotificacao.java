package roteiro05.parte03;

public class TesteNotificacao {
    public static void main(String[] args) {

        Notificacao email = new NotificacaoEmail();
        Notificacao sms = new NotificacaoSMS();
        Notificacao push = new NotificacaoPush();
        
        email.enviar("Bem-vindo ao sistema!");
        sms.enviar("Seu código de verificação é 1234.");
        push.enviar("Você tem uma nova mensagem.");
    }
}

/*  Enquanto na abordagem da parte 02 nos temos a classe testeNotificacao, não depende de implementações concretas, mas sim da interface Notificacao. a abordagem da
 * parte 03 apesar de estar usando uma interface comum Notificacao, o cliente TesteNotificacao instancia diretamente as implementações concretas. O que retira uma camada de acoplação
 * entre o cliente e as implementações. Isso podendo interferir no teste e manutenção do código. A parte 03 agride o principio de inversão de dependecia do SOLID.
 */