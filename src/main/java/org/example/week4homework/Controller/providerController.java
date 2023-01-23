package org.example.week4homework.Controller;

import org.example.week4homework.pojo.provider;
import org.example.week4homework.service.providerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
    public class providerController {

        @RequestMapping("/")
        public String home(){
            return "Hello World!";
        }

        private final providerService providerService;

        @Autowired
        public providerController(providerService providerService) {
            this.providerService = providerService;
        }

        @PostMapping(value = "/userinfo")
        public ResponseEntity<provider> create(@RequestBody provider newUser) {
            provider user = providerService.save(newUser);
            if (user == null) {
                throw new IllegalArgumentException("user is null");
            } else {
                return new ResponseEntity<>(user, HttpStatus.CREATED);
            }
        }

        @GetMapping(value = "/userinfo")
        public ResponseEntity<List<provider>> getAll() {
            List<provider> users = providerService.getAll();
            if (users == null) {
                throw new IllegalArgumentException("user is null");
            } else {
                return new ResponseEntity<>(users, HttpStatus.OK);
            }
        }
    }
