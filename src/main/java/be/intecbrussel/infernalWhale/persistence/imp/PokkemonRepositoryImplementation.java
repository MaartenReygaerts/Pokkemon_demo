package be.intecbrussel.infernalWhale.persistence.imp;

import be.intecbrussel.infernalWhale.model.Pokkemon;
import be.intecbrussel.infernalWhale.persistence.PokkeRepository;
import com.sun.xml.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
@Scope("prototype")
public class PokkemonRepositoryImplementation implements PokkeRepository {

    private final EntityManagerFactory entityManagerFactory;

    @Autowired
    public PokkemonRepositoryImplementation(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    /* private EntityManagerProvider entityManagerProvider;*/
    // Moet je een klasse aanmaken die entitymanager door geeft naar deze klasse


    @Override
    public Pokkemon savePokkemon(Pokkemon pokkemon) {
        EntityManager em = entityManagerFactory.createEntityManager();
        if (pokkemon.getId() == null){
            em.persist(pokkemon);
        }else{
            pokkemon = em.merge(pokkemon);
        }

        em.getTransaction().begin();
        em.getTransaction().commit();

        return pokkemon;
    }

    @Override
    public List<Pokkemon> getAllPokkemon() {
        EntityManager em = entityManagerFactory.createEntityManager();
        String jpqlQuery = "SELECT p FROM Pokkemon p";

        TypedQuery<Pokkemon> typedQuery = em.createQuery(jpqlQuery,Pokkemon.class);
        return typedQuery.getResultList();
    }
}
