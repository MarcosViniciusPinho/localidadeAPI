package br.com.localidade.service.impl;

import br.com.localidade.entity.Estado;
import br.com.localidade.entity.Pais;
import br.com.localidade.repository.EstadoRepository;
import br.com.localidade.service.EstadoService;
import br.com.localidade.service.exception.RecurseNotFoundException;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoServiceImpl implements EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Estado> getEstadosPorPais() {
        List<Estado> estados = this.estadoRepository.findAllByPais(new Pais(1L));
        this.validate(estados);
        return estados;
    }

    private void validate(List<Estado> municipios){
        if(CollectionUtils.isEmpty(municipios)){
            throw new RecurseNotFoundException("Recurso pais não foi encontrado");
        }
    }
}
