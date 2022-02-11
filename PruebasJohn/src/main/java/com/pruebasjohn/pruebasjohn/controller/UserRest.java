package com.pruebasjohn.pruebasjohn.controller;

import com.pruebasjohn.pruebasjohn.domain.User;
import com.pruebasjohn.pruebasjohn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Este es mi servicio rest
@RestController
public class UserRest {

    @Autowired
    UserService userService;

    @GetMapping("/api/users")
    public ResponseEntity<List<User>> getUser(){
        return ResponseEntity.status(HttpStatus.OK).body(userService.findAll());
    }
    //En el post devolvemos un usuario o como tambien puede ser una lista de usuarios
    //Entre parentecis es el tipo de Json al cual vamos a mapear este post en este caso es un usuario

    @PostMapping("/api/users")
    public ResponseEntity<User> postUser(@RequestBody User user){

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(user));
    }





}
