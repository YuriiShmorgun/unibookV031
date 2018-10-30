package model.repository;

import model.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface IStudentCrudRepository extends CrudRepository <StudentEntity, Long> {
}
