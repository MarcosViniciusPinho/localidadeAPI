package br.com.localidade.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Author: Marcos Pinho
 * E-mail: marcosjava2008@gmail.com
 * Classe que representa a tabela estado no banco de dados.
 */
@Entity
@Table(name = "estado")
public class Estado implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 11, nullable = false)
    private Long id;

    @Column(name = "nome", length = 50, nullable = false)
    private String nome;

    @Column(name = "sigla", length = 5, nullable = false)
    private String sigla;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_pais", nullable = false)
    private Pais pais;

    public Estado() {
    }

    public Estado(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public Pais getPais() {
        return pais;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Estado)) {
            return false;
        }
        Estado estado = (Estado) o;
        return id != null ? id.equals(estado.id) : estado.id == null;
    }

    @Override
    public int hashCode() {
        return 0;
    }

}
