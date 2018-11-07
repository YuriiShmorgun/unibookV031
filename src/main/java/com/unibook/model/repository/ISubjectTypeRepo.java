package com.unibook.model.repository;

import com.unibook.model.entity.SubjectType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ISubjectTypeRepo extends CrudRepository <SubjectType,Long> {
    List<SubjectType> findBySubjectTypeNameUa (String subjectType);
}
