package funtamentos.variaveisclasse.atributos;

public class TesteStatic {
	public int a;
	public int b;
	
	public static int c;
	
	
	public void exibirValores() {
		System.out.println("a = " + a + " b = " + b);
		System.out.println("Static c = " + c);
	}
	
	public static void metodoStatic(String str) {
		System.out.println("METODO STATIC:" +str);
	}
}
