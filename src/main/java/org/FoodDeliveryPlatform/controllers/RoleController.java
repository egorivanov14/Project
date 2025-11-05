package org.FoodDeliveryPlatform.controllers;


import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.FoodDeliveryPlatform.Entity.UserService.RoleEntity;
import org.FoodDeliveryPlatform.repository.UserService.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class RoleController {

    @Autowired
    private final RoleRepository roleRepository;
    private final ObjectMapper objectMapper;


    @PostMapping("/api/roles/create")
    public RoleEntity addRole(@RequestBody RoleEntity role){
        return roleRepository.save(role);
    }

    @SneakyThrows
    @GetMapping("/api/roles/get")
    public List<RoleEntity> getAll() {
        return roleRepository.findAll();
    }

    @GetMapping("/api/roles/getById")
    public RoleEntity getById(@RequestParam Integer id){
        return roleRepository.findById(id).orElseThrow();
    }


    @DeleteMapping("/api/roles/deleteById")
    public void deleteById(@RequestParam Integer id){
        roleRepository.deleteById(id);
    }

}
