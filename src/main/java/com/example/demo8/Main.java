package com.example.demo8;

import com.example.demo8.entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");

        EntityManager em = emf.createEntityManager();

/*
        Product product1 = new Product(1, "product 1");
        Product product2 = new Product(2, "product 2");

        em.getTransaction().begin();
        em.persist(product1);
        //product1.setName("product 11");
        em.persist(product2);
        em.getTransaction().commit();
*/

        TypedQuery<Product> query = em.createQuery("select p from Product p", Product.class);
        List<Product> list = query.getResultList();
        list.forEach(System.out::println);
        System.out.println("Ok");

    }
}
