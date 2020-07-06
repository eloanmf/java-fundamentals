package funtamentos.resolvendoproblemas.poo;

public class BombaDeCombustivel {
	
	private String combustivel;
	private float precoLitro;
	private float precoTotal;
	private float qtdLitros;
	private boolean emAbastecimento;
	
	public BombaDeCombustivel(String combustivel, float preco) {
		this.combustivel = combustivel;
		this.precoLitro = preco;
		this.precoTotal = 0f;
		this.qtdLitros = 0f;
		this.emAbastecimento = false;
	}
	
	public void puxarGancho() {
		this.emAbastecimento = true;
		this.precoTotal = 0.0f;
		this.qtdLitros = 0.0f;
		System.out.println("Bomba "+ this.combustivel + " pronta pra abastecer");
	}
	
	public void voltarGancho() {
		this.emAbastecimento = false;
		//mostrar totais...
		System.out.println("============================");
		System.out.println("|     POSTO BOA VISTA      |");
		System.out.println("============================");
		System.out.println("Combustivel: "+this.combustivel);
		System.out.println("===== Preco do Litro: R$" + this.precoLitro);
		System.out.println("===== Litros: " + this.qtdLitros + " L");
		System.out.println("===== Valor total R$ " + this.precoTotal);
	}
	
	public void abastecerProLitros(float litros) {
		if (this.emAbastecimento) {
			this.qtdLitros = litros;
			this.precoTotal = this.qtdLitros * this.precoLitro;
			System.out.println("Bomba " +combustivel+ " em abastecimento");
		} else {
			System.out.println("Tire o bico do gancho");
		}	
	}
	
	public void abastecerPorValor(float valor) {
		if (this.emAbastecimento) {
			this.precoTotal = valor;
			this.qtdLitros = this.precoTotal / this.precoLitro;
			System.out.println("Bomba " +combustivel+ " em abastecimento");
		} else {
			System.out.println("Tire o bico do gancho");
		}
	}
	
	
}
