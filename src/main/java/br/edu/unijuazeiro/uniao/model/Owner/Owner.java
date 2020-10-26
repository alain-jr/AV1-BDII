package br.edu.unijuazeiro.uniao.model.Owner; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor 
@Entity
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_owner")
    @SequenceGenerator(sequenceName = "seq_owner", allocationSize = 1, initialValue = 1, name = "gen_owner")
    private Integer code;

    @Column(nullable = false)
    private String name;

    @Column(unique = true)
    private String cpf;

    
    
}
