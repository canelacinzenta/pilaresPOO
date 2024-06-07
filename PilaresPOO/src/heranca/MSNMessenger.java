package heranca;

public class MSNMessenger {
	public void enviarMensagem() {
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
	}
}
