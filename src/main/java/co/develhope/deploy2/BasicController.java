package co.develhope.deploy2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/basic")
public class BasicController {

    Random random = new Random();

    @GetMapping("/sum")
    public Integer getSum(){

        return random.nextInt(32)+random.nextInt(32);
    }
}