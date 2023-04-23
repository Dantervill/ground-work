package com.example.testproject.cache;

import com.example.testproject.model.firstlevelcache.City;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(classes = SecondLevelTest.class)
class SecondLevelTest {

//    @PersistenceContext
//    private EntityManager em;
//
//    @Test
//    @Transactional
//    void find1() {
//        City city = em.find(City.class, 1L);
//        System.out.println("select_1");
//        Assertions.assertEquals("Moscow", city.getName());
//    }
//
//    @Test
//    @Transactional
//    void find2() {
//        City city = em.find(City.class, 1L);
//        System.out.println("select_2");
//        Assertions.assertEquals("Moscow", city.getName());
//    }
}
