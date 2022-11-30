package it.academy.corso.model;
import javax.persistence.*;
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "nome")
    private String nome;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}