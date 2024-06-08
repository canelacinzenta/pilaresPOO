package heranca;

public class FacebookMessenger extends ServicoMensagemInstantanea{

	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
		
}
	/*public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem facebook");
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem facebook");
	}
	private void validarConectadoInternet() {
		System.out.println("Validando conexão com internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando histórico de mensagem");
	}
	*/

