package estudo.dio.projeto;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		LeituraDeDados lerDados = new LeituraDeDados(list);
		list = lerDados.lerDados();

		if (!list.isEmpty() && list.size() == 2)
			Contador.contar(list.get(0), list.get(1));

	}
}
