package estudo.dio.projeto;

import estudo.dio.excepitons.ParametrosInvalidosException;

public class Contador {
	public Contador() { 
		
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) throw new ParametrosInvalidosException();
		
		int contagem = parametroDois - parametroUm;
		for (int aux = 0; aux < contagem; aux++) {
			System.out.println("Imprimindo numero: " + (aux+1));
		}
	}
}