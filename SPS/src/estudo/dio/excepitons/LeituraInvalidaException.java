package estudo.dio.excepitons;

public class LeituraInvalidaException extends RuntimeException{
	@Override
	public String toString() {
		return "Problema na Leitura, entre com um numero inteiro";
	}
}
