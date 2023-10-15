package br.com.eduardofontana.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/")
    public String create(@RequestBody UserModel userModel) {
        System.out.println(userModel.username);
        return "ok";
    }
}
