package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * Created by Radu on 5/28/2018.
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
