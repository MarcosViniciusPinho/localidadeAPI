package br.com.localidade.service.impl;

import br.com.localidade.entity.Estado;
import br.com.localidade.entity.Municipio;
import br.com.localidade.repository.MunicipioRepository;
import br.com.localidade.service.MunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
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
        return this.municipioRepository.findAllByEstado(estado);
    }

}
