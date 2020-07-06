package funtamentos.variaveisclasse.atributos;

public class AppDocumentos {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Documento d1, d2, d3;
		d1 = new Documento("1", "CPF");
		d2 = new Documento("2", "IDENTIDADE");
		d3 = new Documento("3", "CNH");
		
		d1.exibirDados();
		d1.setStatus(Documento.EM_PROCESSAMENTO);
		d1.exibirDados();
		d1.setStatus(Documento.FINALIZANDO);
		d1.exibirDados();
		
		
	}

}
