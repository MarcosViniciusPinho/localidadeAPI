package br.com.localidade.entity;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Author: Marcos Pinho
 * E-mail: marcosjava2008@gmail.com
 * Classe que representa a tabela pais no banco de dados.
 */
@Entity
@Table(name = "pais")
public class Pais implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 11, nullable = false)
    private Long id;

    @Column(name = "nome", length = 50, nullable = false)
    private String nome;

    public Pais() {
    }

    public Pais(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pais)) {
            return false;
        }
        Pais pais = (Pais) o;
        return id != null ? id.equals(pais.id) : pais.id == null;
    }

    @Override
    public int hashCode() {
        return 0;
    }

}
