package vetor;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		String vetorString[] = {"Boxer", "Pastor Alemão", "Pinscher", "Husky Siberiano", "Corgi"};
		
		for(int i = 0; i < vetorString.length; i++ ) {
			System.out.println((i+1) + "º elemento : " + vetorString[i]);
		} 
		
	}

}
