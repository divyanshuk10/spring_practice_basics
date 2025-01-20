package com.example.demo_step_1.mockito_example;

import com.example.demo_step_1.application_context_via_xml.XMLDatabaseConnection;
import com.example.demo_step_1.application_context_via_xml.XMLPersonDao;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith(MockitoExtension.class)
class XMLPersonDaoMockitoTest {

    @Mock
    XMLDatabaseConnection databaseConnection;

    @InjectMocks
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
        Mockito.when(personDao.getName()).thenReturn(XMLPersonDao.class.getSimpleName());
        assertEquals(XMLPersonDao.class.getSimpleName(), personDao.getName());
    }

    @Test
    void test2() {
        System.out.println("Test 2");
        Mockito.when(personDao.getName()).thenReturn("Some dummy name");
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