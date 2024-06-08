package heranca;

public class MSNMessenger extends ServicoMensagemInstantanea{
	
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo MSN Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");
	}
	/*public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem msn");
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem msn");
	}
	private void validarConectadoInternet() {
		System.out.println("Validando conexão com internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando histórico de mensagem");
	}*/
}
