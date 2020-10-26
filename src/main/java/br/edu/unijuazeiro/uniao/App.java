package br.edu.unijuazeiro.uniao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.unijuazeiro.uniao.model.Animal.Animal;
import br.edu.unijuazeiro.uniao.model.Owner.Owner;


public final class App {
    private App() {
    }

    public static void main(String[] args) {
        System.out.println("Primeira Conexao: " + Persistence.createEntityManagerFactory("unit-unijuazeiro"));
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit-unijuazeiro");
        EntityManager em = emf.createEntityManager();
         em.getTransaction().begin();

        // CADASTRAR
        //Owner o = new Owner("Alain Lindo", "073.256.988-99");
        // em.persist(o);
        //Animal a = new Animal("Mel", "Pincher");
        // em.persist(a);

        // BUSCAR POR CODIGO
        // Owner = em.find(Owner.class, 1);
        // System.out.println("Codigo " + c.getCode());
        // System.out.println("Nome " + c.getName());
        // System.out.println("CPF " + c.getcpf());
        // Animal = em.find(Animal.class, 1);
        // System.out.println("Codigo " + c.getCode());
        // System.out.println("Nome " + c.getName());
        // System.out.println("Raça " + c.getbreed());


        // ATUALIZAR
        //Owner o = em.find(Owner.class, 1);
        //o.setName("Junior");
        //em.merge(o); // envia para banco
        //em.refresh(o); // traz pra aplicacao/atualiza o objeto na aplicacao
        //Animal a = em.find(Animal.class, 1);
        //o.setName("Jennifer");
        //em.merge(o); // envia para banco
        //em.refresh(o); // traz pra aplicacao/atualiza o objeto na aplicacao
        //System.out.println("Nome " + c.getName());
        
        // DELETAR 
        //Owner o = em.find(Owner.class, 1);
        //em.remove(o);
     

       // LISTAR
       // Animal a = em.find(Animal.class, 1);
       // em.createQuery("from tb_animal", Animal.class).getResultList().forEach(o -> {
       // System.out.println("nome: " + o.getName()); 
       // System.out.println("raça: " + o.getBreed());
       //});
       // Owner o = em.find(Owner.class, 1);
       // em.createQuery("from tb_owner", Owner.class).getResultList().forEach(o -> {
       // System.out.println("nome: " + o.getName()); 
       // System.out.println("cpf: " + o.getcpf());
       // });
    
        
        em.getTransaction().commit();
        em.close();
        emf.close();
        
    }
} 