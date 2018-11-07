package com.unibook.model.repository;

import com.unibook.model.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface IPersonRepo extends CrudRepository <Person, Long>{
}
