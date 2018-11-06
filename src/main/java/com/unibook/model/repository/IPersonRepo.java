package com.unibook.model.repository;

import com.unibook.model.entity.newEntity.PersonEntity;
import org.springframework.data.repository.CrudRepository;

public interface IPersonRepo extends CrudRepository <PersonEntity, Long>{
}
