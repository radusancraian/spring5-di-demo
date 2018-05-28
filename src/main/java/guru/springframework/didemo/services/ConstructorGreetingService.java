package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Created by Radu on 5/28/2018.
 */
@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return " Hello! I was injected via the constructor!!";
    }
}
