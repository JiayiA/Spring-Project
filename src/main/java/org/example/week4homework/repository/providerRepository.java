package org.example.week4homework.repository;

import org.example.week4homework.pojo.provider;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class providerRepository {
    private final Map<String, provider> map = new HashMap<>();

    public void init(){

    }

    public Collection<provider> findAll(){
        return map.values();
    }

    public void add(provider user){
        map.put(String.valueOf(map.size()+1), user);
    }
}
