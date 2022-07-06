package UserService.DemoServiceHalyk.Controllers;

import UserService.DemoServiceHalyk.Model.User;
import UserService.DemoServiceHalyk.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepo userRepo;

    @GetMapping(value ="/")
    public String getIdUser(){
        return "Welcome User!";
    }

    @GetMapping(value = "/users")
    public List<User> getUser(){
        return userRepo.findAll();
    }


    @PostMapping(value = "/save")
    public String saveUser(@RequestBody User user){
        userRepo.save(user);
        return "New user added!";
    }

    @GetMapping(value = "/get/{per_num}")
    public Object getUserByPerNum(@PathVariable Long per_num){
        if (per_num == 0){
            return userRepo.findAll();
        }
        User userExample = new User();
        List<User> users = userRepo.findAll();
        for (User userByFind : users) {

            if(userByFind.getPer_num() == per_num){
                System.out.println("True");
                userExample.setId(userByFind.getId());
                userExample.setPer_num(userByFind.getPer_num());
                userExample.setFullName(userByFind.getFullName());
                userExample.setBirthDate(userByFind.getBirthDate());
                userExample.setRole(userByFind.getRole());
                return userExample;
            };
        };
        return userExample;
    }


}
