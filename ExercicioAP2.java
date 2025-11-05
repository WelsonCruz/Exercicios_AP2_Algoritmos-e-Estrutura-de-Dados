//Implemente uma classe Lista que use um vetor de inteiros para armazenar até
//5 elementos.
//Adicione os métodos inserir(int valor) e mostrar().
package ExercicioAP2;
import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioAP2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList();
		for (int i = 1; i <= 5; i++) {
			int elemento = in.nextInt();
			
			numeros.add(elemento);
		}
		

		System.out.println(numeros);

	}

}
