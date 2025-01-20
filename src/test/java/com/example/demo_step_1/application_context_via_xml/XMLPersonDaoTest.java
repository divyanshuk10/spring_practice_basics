package com.example.demo_step_1.application_context_via_xml;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class XMLPersonDaoTest {

    XMLPersonDao personDao;

    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("BeforeEach");
    }

    @Test
    void test1() {
        System.out.println("Test 1");
        assertEquals(XMLPersonDao.class.getSimpleName(), personDao.getName());
    }

    @Test
    void test2() {
        System.out.println("Test 2");
        assertNotEquals(XMLPersonDao.class.getCanonicalName(), personDao.getName());
    }

    @AfterEach
    void afterEach() {
        System.out.println("AfterEach");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AfterAll");
    }


}