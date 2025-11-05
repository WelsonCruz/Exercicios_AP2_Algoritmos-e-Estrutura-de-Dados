//Crie uma classe Pilha que permita empilhar e desempilhar valores inteiros.
//Use os métodos empilhar(int valor) e desempilhar().

package ExercicioAP2;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicios_2 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList();
		numeros.add(3);
		numeros.add(47);
		numeros.add(56);
		numeros.add(53);
		System.out.println("Lista completa "+ numeros);
		for (int i = numeros.size() - 1; i >= 0; i--) {
			System.out.println("O elemento: " + numeros.get(i) + " sera removido");
			numeros.remove(i);
			System.out.println(numeros);
		}

	}

}
