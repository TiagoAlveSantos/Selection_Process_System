package estudo.dio.excepitons;

public class ParametrosInvalidosException extends RuntimeException{
	
	@Override
	public String toString() {
		return "O segundo parametro deve ser maior que o primeiro";
	}
}
