package funtamentos.variaveisclasse.atributos;

public class Documento {
	private String id;
	private String nome;
	private int status;
	
	//final significa q é fixo.
	
	public static final int  NOVO_DOCUMENTO				= 0;
	public static final int  EM_PROCESSAMENTO 			= 1;
	public static final int  AGUARDANDO_AUTORIZACAO 	= 2;
	public static final int  FINALIZANDO 				= 3;
	
	public Documento(String i, String nome) {
		this.id = i;
		this.nome = nome;
		this.status = NOVO_DOCUMENTO;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public void exibirDados() {
		System.out.println(id + "." +nome+ "("+status+")");
	}
	
	
	
	
	
}
