package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Radu on 5/28/2018.
 */
public class ConstructorInjectedControllerTest {

    private ContructorInjectedController contructorInjectedController;

    @Before
    public void setUp() throws Exception {

        contructorInjectedController = new ContructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws  Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, contructorInjectedController.sayHello());
    }
}
