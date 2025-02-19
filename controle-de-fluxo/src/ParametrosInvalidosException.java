public class ParametrosInvalidosException extends  Exception{
    public ParametrosInvalidosException() {
        super("\nParâmetros inválidos: o segundo parâmetro deve ser maior que o primeiro.");
    }
}
