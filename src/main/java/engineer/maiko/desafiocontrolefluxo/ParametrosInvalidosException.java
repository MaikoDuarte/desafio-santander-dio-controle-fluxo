package engineer.maiko.desafiocontrolefluxo;

public class ParametrosInvalidosException extends Exception {
  public String message;

  public ParametrosInvalidosException() {
    this.message = "O segundo parâmetro deve ser maior que o primeiro";

  }

    @Override
    public String getMessage() {
      return this.message;
    }


  }



