package org.example.week4homework.repository;

import org.example.week4homework.pojo.provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface providerRepository extends JpaRepository<provider, Long> {
}
