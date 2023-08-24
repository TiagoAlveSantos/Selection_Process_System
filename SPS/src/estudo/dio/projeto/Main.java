package estudo.dio.projeto;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer> ();
		LeituraDeDados lerDados = new LeituraDeDados(list);
		list = lerDados.lerDados();
		//System.out.println(list);
		
		
		try {
			if(!list.isEmpty()) 
				Contador.contar(list.get(0), list.get(1));
		
		}catch (Exception exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro: " + exception);
		}
		
	}
}
