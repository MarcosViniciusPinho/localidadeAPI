package br.com.localidade.handler;

import br.com.localidade.handler.domain.ResponseError;
import br.com.localidade.service.exception.RecurseNotFoundException;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Arrays;
import java.util.List;

@ControllerAdvice
public class CarrinhoApiHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ RecurseNotFoundException.class })
    public ResponseEntity<Object> handleRecurseNotFoundException(RecurseNotFoundException ex, WebRequest request) {
        List<ResponseError> erros = Arrays.asList(new ResponseError(
                ex.getMessage(), ExceptionUtils.getRootCauseMessage(ex)));
        return handleExceptionInternal(ex, erros, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

}