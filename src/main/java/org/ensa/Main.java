package org.ensa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.ensa.Entities.ADDRESS;
import org.ensa.Entities.Course;
import org.ensa.Entities.Letudiant;
import org.ensa.Entities.Prof;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!,let's test all the cardinals exist in the JPA");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Cardinalite");
        EntityManager em = emf.createEntityManager();
        /*
TEST CARDINALITE 1To1 ETUDINAT--->ADDRESS
            Letudiant me = new  Letudiant();
            ADDRESS address = new ADDRESS();
             LocalDate date = LocalDate.of(2004,03,21);
            address.setPays("Maroc");
            address.setRue("Oued Lkbir");
            address.setVille("Marrakech");
            address.setCodePostal(40000);
            me.setNom("TAHER");
            me.setPrenom("Karima");
            me.setEmail("taherkarima47@gmail.com");
            me.setBirthday(date);
            me.setAdress(address);

            em.getTransaction().begin();
            em.persist(me);
            Letudiant moi = em.find(Letudiant.class,1);
            em.remove(moi);//puisque cascade est PERSIST , address va etre supprimer dans BD
            em.getTransaction().commit();
*/
        /*
        TEST Cardinalite 1to1 Bidirection :  ETUDINAT <---> ADDRESS
        LocalDate date = LocalDate.of(2003,02,27);
        Letudiant etudiant = new Letudiant();
        ADDRESS address = new ADDRESS();

        address.setVille("San Francisco");
        address.setRue("Alcarataz");
        address.setPays("Etats Unis,California");
        address.setCodePostal(33434);

        etudiant.setPrenom("John");
        etudiant.setNom("Doe");
        etudiant.setEmail("johndoe@yahoo.com");
        etudiant.setBirthday(date);
        etudiant.setAdress(address);

        em.getTransaction().begin();
        em.persist(etudiant);
        em.getTransaction().commit();

         */
        /*
            Test de mappedBy
            Livraison livraison = new Livraison();
            Commande commande = new Commande();

            livraison.setCode("122SDSF");
            livraison.setVille("Mozanbik");

            commande.setDescription("blabla");
            commande.setNom("POJO");
            commande.setLivraison(livraison);
        */
        /*
          Test Cardinalite Course <---Bidirection---> Prof
         -----> Pas de creation de la table Jointure
            Prof prof = new Prof();
            Course course = new Course();
            course.setName("JEE");
            course.setDescription("Jakarta Enterprise Edition");
            Prof prof1 = new Prof();


            prof.setNom("Atlas");
            prof.setPrenom("Abdelghafour");
            prof.setCours(course);

            prof1.setNom("Nejoui");
            prof1.setPrenom("abdesadek");
            prof1.setCours(course);

            em.getTransaction().begin();
            em.persist(prof);
            em.persist(prof1);
            em.getTransaction().commit();
        */
        /*
           Test de *to* Etudiant <---Bidirection---->Cours
           --->Creation d'une seule table de jointure

            Letudiant etudiant = new Letudiant();
            ADDRESS address = new ADDRESS();
            LocalDate date = LocalDate.of(2009,03,27);
            Course course = new Course();
            Course course2 = new Course();
            Collection<Course> courses = new ArrayList<>();

            address.setPays("ALgerie");
            address.setRue("HADDAF");
            address.setCodePostal(232424);
            address.setVille("Blida");

            course.setName("Java POO");
            course.setDescription("oriented object in java");
            course2.setName("C++");
            course2.setDescription("language C++");

            courses.add(course);
            courses.add(course2);

            etudiant.setNom("EKE");
            etudiant.setPrenom("Daniel");
            etudiant.setEmail("daniel@gmail.com");
            etudiant.setBirthday(date);
            etudiant.setAdress(address);
            etudiant.setCourses(courses);


            em.getTransaction().begin();
            em.persist(etudiant);
            em.getTransaction().commit();
        */
        /*
        * POUR LE CAS DE MAPPEDSUPERCLASS
        * la calsse parent ne sera pas mappé avec une table de la base de donnée
        * les classes child vont etre mappés et vont avoir les attributs de la classe parent et sa clé primaire en plus de leurs attributs
        * */

        /*
        * Pour le CAS DE TABLE_PER_CLASS
        * tout les classes (enfants et parent) vont etre mappé avec des tables séparés dans la base de données
        * les calsses child vont avoir les attributs de la classe parent en plus de leurs attributs et aussi sa clé primaire
        * si la classe parent est abstrait , va pas étre mappé avec la base de données donc on aura le meme cas de MAPPEDSUPERCLASS
        * */








    }
}