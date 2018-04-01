package br.com.localidade.repository;

import br.com.localidade.entity.Estado;
import br.com.localidade.entity.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author: Marcos Pinho
 * E-mail: marcosjava2008@gmail.com
 */
@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

    List<Estado> findAllByPais(Pais pais);

    Estado findBySigla(String sigla);

} 
