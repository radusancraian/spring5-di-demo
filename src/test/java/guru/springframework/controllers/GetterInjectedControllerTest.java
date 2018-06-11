package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Radu on 5/28/2018.
 */
public class GetterInjectedControllerTest {

    private GetterInjectedController getterInjectedController;

    @Before
    public void setUp() throws Exception {

        getterInjectedController = new GetterInjectedController();
        getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, getterInjectedController.sayHello());
    }

}
