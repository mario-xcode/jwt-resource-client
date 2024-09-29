package jwt.resource.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/api/resources")
public class ResourceController {

    @GetMapping("/users")
    public String getUsers() {
        return "return list of users autenticated by token";
    }
}
