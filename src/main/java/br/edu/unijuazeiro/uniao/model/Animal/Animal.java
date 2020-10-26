package br.edu.unijuazeiro.uniao.model.Animal;

import br.edu.unijuazeiro.uniao.model.Owner.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_animal")
    @SequenceGenerator(sequenceName = "seq_animal", allocationSize = 1, 
        initialValue = 1, name = "gen_animal")
    private Integer code;

    private String name;
    
    private String breed ;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Owner owner;


}
