package br.com.localidade.service.exception;

public class RecurseNotFoundException extends RuntimeException {

    public RecurseNotFoundException(String mensagem) {
        super(mensagem);
    }

}
