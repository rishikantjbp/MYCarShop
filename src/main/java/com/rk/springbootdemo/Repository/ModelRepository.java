package com.rk.springbootdemo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.rk.springbootdemo.Model.Models;

public interface ModelRepository extends CrudRepository<Models, String> {

}
