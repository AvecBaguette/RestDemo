package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.Sport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface SportRepository extends CrudRepository<Sport, Long> {

    List<Sport> findByName(String name);

    Sport findById(long id);

    @Override
    List<Sport> findAll();

    @Transactional
    long deleteByName(String name);
    //test
    //test2
}
