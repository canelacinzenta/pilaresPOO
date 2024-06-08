package heranca;

public abstract class ServicoMensagemInstantanea {
	/*public void enviarMensagem() {
		//primeiro confirma se está conectado a internet chamando o método
		validarConectadoInternet();
		System.out.println("Enviando mensagem");
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
	
	//métodos privados, visíveis somente nas classes
	private void validarConectadoInternet() {
		System.out.println("Validando conexão com internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando histórico de mensagens");
	}*/
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
}
