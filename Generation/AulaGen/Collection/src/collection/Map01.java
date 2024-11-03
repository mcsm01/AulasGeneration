package collection;

import java.util.HashMap;

public class Map01 {

	public static void main(String[] args) {
		HashMap<Long , String > pessoa = new HashMap<>();
		
		pessoa.put(11241252457L, "Maria");
		pessoa.put(11241222476L, "Marina");
		pessoa.put(11241254454L, "Jaqueline");
		
		System.out.println(" " + pessoa.get(11241252457L));


	}

}
