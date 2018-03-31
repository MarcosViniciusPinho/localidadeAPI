package br.com.localidade.service;

import br.com.localidade.entity.Estado;
import br.com.localidade.entity.Municipio;

import java.util.List;

/**
 * Author: Marcos Pinho
 * E-mail: marcosjava2008@gmail.com
 */
public interface MunicipioService {

    List<Municipio> getMunicipiosPorEstado(Estado estado);

} 
