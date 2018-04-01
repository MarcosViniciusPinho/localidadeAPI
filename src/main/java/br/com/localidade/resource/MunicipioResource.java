package br.com.localidade.resource;

import br.com.localidade.entity.Estado;
import br.com.localidade.entity.Municipio;
import br.com.localidade.service.EstadoService;
import br.com.localidade.service.MunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/municipios")
public class MunicipioResource {

    @Autowired
    private MunicipioService municipioService;

    @Autowired
    private EstadoService estadoService;

    @GetMapping(value = "/{sigla}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<List<Municipio>> listarMunicipiosPorEstado(@PathVariable(value = "sigla") String sigla){
        Estado estado = this.estadoService.getEstadoPelaSigla(sigla);
        return ResponseEntity.ok().body(this.municipioService.getMunicipiosPorEstado(estado));
    }

}
