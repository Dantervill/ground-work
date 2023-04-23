package com.example.testproject.cache;

import com.example.testproject.model.firstlevelcache.City;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class FirstLevelCacheTest {

//    @PersistenceContext
//    private EntityManager em;

//    @Test
//    @Transactional
//    void when2Finds_thenOneFind() {
//        System.out.println("EntityManager/Session is open: " + em.isOpen());
//        City city = em.find(City.class, 1L);
//        System.out.println("finding for the 1 time");
//        Assertions.assertEquals("Moscow", city.getName());
//        City city2 = em.find(City.class, 1L);
//        System.out.println("finding for the 2 time");
//        Assertions.assertEquals("Moscow", city2.getName());
//        System.out.println("EntityManager/Session is open: " + em.isOpen());
//    }
}
