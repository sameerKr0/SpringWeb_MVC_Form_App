package in.sameerit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sameerit.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

}
