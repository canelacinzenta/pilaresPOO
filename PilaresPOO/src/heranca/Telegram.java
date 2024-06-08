package heranca;

public class Telegram extends ServicoMensagemInstantanea{
	
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Telegram");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}
	/*public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem telegram");
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem telegram");
	}
	private void validarConectadoInternet() {
		System.out.println("Validando conexão com internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando histórico de mensagem");
	}*/
}
