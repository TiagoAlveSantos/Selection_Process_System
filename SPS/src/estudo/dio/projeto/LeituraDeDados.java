package estudo.dio.projeto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import estudo.dio.excepitons.LeituraInvalidaException;

public class LeituraDeDados {
	List<Integer> lista = new ArrayList<Integer>();
		
	public LeituraDeDados(List<Integer> lista) {
		this.lista = lista;
	}

	public List<Integer> lerDados() throws LeituraInvalidaException{
		
		try {	
			Scanner terminal = new Scanner(System.in);
			System.out.println("Digite o primeiro parâmetro");
			lista.add(terminal.nextInt());
			System.out.println("Digite o segundo parâmetro");
			lista.add(terminal.nextInt());

		} catch (InputMismatchException exception) {
			System.out.println("Problema na Leitura, entre com um numero inteiro");
		}
		return lista;
	}
}
