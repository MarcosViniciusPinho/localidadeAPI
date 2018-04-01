package br.com.localidade.service.impl;

import br.com.localidade.entity.Estado;
import br.com.localidade.entity.Municipio;
import br.com.localidade.repository.MunicipioRepository;
import br.com.localidade.service.MunicipioService;
import br.com.localidade.service.exception.RecurseNotFoundException;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MunicipioServiceImpl implements MunicipioService {

    @Autowired
    private MunicipioRepository municipioRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Municipio> getMunicipiosPorEstado(Estado estado) {
        List<Municipio> municipios = this.municipioRepository.findAllByEstado(estado, new Sort(Sort.Direction.ASC, "nome"));
        this.validate(municipios);
        return municipios;
    }

    private void validate(List<Municipio> municipios){
        if(CollectionUtils.isEmpty(municipios)){
            throw new RecurseNotFoundException("Recurso estado não foi encontrado");
        }
    }

}
