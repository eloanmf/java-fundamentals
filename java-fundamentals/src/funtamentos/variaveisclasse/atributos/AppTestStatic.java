package funtamentos.variaveisclasse.atributos;

public class AppTestStatic {

	public static void main(String[] args) {
		 
		TesteStatic t1, t2;
		
		t1 = new TesteStatic();
		t2 = new TesteStatic();
		
		t1.a = 100;
		t2.b = 150;
			
		TesteStatic.c = 500;
		
		t1.exibirValores();
		t2.exibirValores();
		
		TesteStatic.metodoStatic("Teste");
				

	}

}
