package funtamentos.resolvendoproblemas.poo;

public class AppBombaDeCombustivel {
	public static void main(String[] args) {
		
		BombaDeCombustivel bombaA = new BombaDeCombustivel("Gasolina", 4.25f);
		BombaDeCombustivel bombaB = new BombaDeCombustivel("Diesel", 3.20f);
		
		
		bombaA.puxarGancho();
		bombaA.abastecerProLitros(56.26f);
		bombaA.voltarGancho();
		
		System.out.println();
		
		bombaB.puxarGancho();
		bombaB.abastecerPorValor(50.00f);
		bombaB.voltarGancho();
		
	}
}
