package com.Sainz.demo;

import org.springframework.data.repository.CrudRepository;
//what is crud repository?

public interface ToyRepository extends CrudRepository<Toy, Long> {
}
