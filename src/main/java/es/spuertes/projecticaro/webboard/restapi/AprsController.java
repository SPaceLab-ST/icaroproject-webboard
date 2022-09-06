package es.spuertes.projecticaro.webboard.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AprsController {

    @GetMapping(value = "/")
    public void getStoredData() {
        System.out.println("Arrive");
    }
}
