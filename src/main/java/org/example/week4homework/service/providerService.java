package org.example.week4homework.service;
import org.example.week4homework.pojo.provider;
import org.example.week4homework.repository.providerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class providerService {

    private final providerRepository providerRepository;

    @Autowired
    public providerService(providerRepository providerRepository){
        this.providerRepository = providerRepository;
    }

    public provider save(provider user){
        providerRepository.add(user);
        if(user == null) {
            throw new IllegalArgumentException("Can't create student since it's null");
        }
        return user;
    }

    public List<provider> getAll(){
        List<provider> users = new ArrayList<provider>(providerRepository.findAll());
        if(users == null) {
            throw new IllegalArgumentException("Can't create student since it's null");
        }
        return users;
    }

}
