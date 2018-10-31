package com.unibook.model.repository;

import com.unibook.model.entity.Message;
import org.springframework.data.repository.CrudRepository;

public interface IMessageRepo extends CrudRepository<Message, Long> {
}
