package vetor;

import java.util.Arrays;

public class Vetor3 {
	
	public static void main(String[] args) {
		
		String grupoA[] = { "Amanda", "Elen", "Vinicius" };
        String grupoB[] = { "Samantha", "Letícia", "Alan" };
        
        System.out.println("Os Arrays são iguais?");
        
        if(Arrays.equals(grupoA, grupoB)) {
        	System.out.println("Sim, são igauis.");
		}else {
		System.out.print("Não, não são iguais.");
		
		}
	}

}
