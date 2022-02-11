package com.pruebasjohn.pruebasjohn.service;

import com.pruebasjohn.pruebasjohn.domain.User;
import com.pruebasjohn.pruebasjohn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class UserService {
@Autowired
    UserRepository userRepository;
public void init() {
    if (userRepository.findAll().isEmpty()) {
        User user = new User();
        user.setNombre("John");
        create(user);
        User user2 = new User();
        user2.setNombre("Juan");
        create(user2);
        User user3 = new User();
        user3.setNombre("Maria");
        create(user3);

    }
}


//Servicio con validacion de ingreso obligatorio del nombre de usuario
public User create(User user){
    if(user.getNombre()==null || user.getNombre().isEmpty()){
        throw new RuntimeException("El nombre es obligatorio");
    }
    else {
        return userRepository.save(user);
    }
}
//Servicio para obtener todos los usuarios
    public List<User> findAll() {
        return userRepository.findAll();
    }


}
