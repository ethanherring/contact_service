package com.usercontact.contact;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping("/welcome")
    public String first_route() {
        return "Welcome to the Rest API Backend";
    }

    @GetMapping("/return_object")
    public int return_object() {
        //Create Instance of Basic Object Class
        BasicObject object1 = new BasicObject(2, 2);

        return(object1.ReturnAddition(2, 2));
    }

    @GetMapping("/get_user")
    public UserObject getName() {
        return new UserObject();
    }

}
