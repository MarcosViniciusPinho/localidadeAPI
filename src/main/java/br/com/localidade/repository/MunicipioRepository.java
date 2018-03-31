package br.com.localidade.repository;

import br.com.localidade.entity.Municipio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: Marcos Pinho
 * E-mail: marcosjava2008@gmail.com
 */
@Repository
public interface MunicipioRepository extends JpaRepository<Municipio, Long> {
} 
