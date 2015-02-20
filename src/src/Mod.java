package src;

public class Mod {

	//Metodo para calcular o numero de n mod 2 = 1 de um dado numero. Se o n for dividido sucessivamente.
	public static int contaMod1(int n) {
		int contador = 0;
		while (n > 0) {
			if (n % 2 == 1) {
				contador++;
			}
			n = (int) Math.floor(n / 2);
		}
		return contador;
	}

	//Mostra o elemento que tem o maior numero de n mod 2 = 1 em um intervalo dado
	public static void main(String[] args) {
		int numeroMaior = 0;
		int elementosMod1 = 0;
		for (int i = 0; i <= 10000; i++) { //coloca o intervalo pedido
			int resultado = contaMod1(i); //chama a função implementada acima
			if (resultado > elementosMod1) {
				elementosMod1 = resultado;
				numeroMaior = i;
			}
			System.out.println("Entrada " + i + " | Resultado igual a: " + resultado);

		}
		System.out.println("\n\nIndice maior: " + numeroMaior + " | Contador maior: " + elementosMod1);
	}
}
