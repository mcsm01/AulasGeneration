package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class List01 {

	public static void main(String[] args) {
		
		ArrayList<Double> notas = new ArrayList<Double>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite primeira nota: ");
		notas.add(scanner.nextDouble());
		
		notas.add(5.0);
        notas.add(4.0);
        notas.add(10.0);
        notas.add(4.0);
        
        System.out.println("\nNotas cadastradas - Laços for...Each");
        
        for(Double nota : notas) {
        	if(nota % 2 == 0 ) {
        	System.out.println(nota);
        	}
        	
        }
        
        notas.add(1, 10.5);
        System.out.println(notas);
        
        System.out.println("\nQual nota voce quer conferir?");
        System.out.println("\n Notas 7.5 esta na lista? " + notas.lastIndexOf(5.0));
        
        System.out.println("\nA posição da nota 5 é: " + notas.contains(5d));
        System.out.println("\nA posição da nota 5 é: " + notas.lastIndexOf(5.0));

	}

}
