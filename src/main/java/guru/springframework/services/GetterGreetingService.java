package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * Created by Radu on 5/28/2018.
 */
@Service
public class GetterGreetingService  implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello I was injected by the getter";
    }
}
