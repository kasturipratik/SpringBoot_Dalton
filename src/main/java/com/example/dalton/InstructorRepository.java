package com.example.dalton;

import org.springframework.data.repository.CrudRepository;

public interface InstructorRepository extends CrudRepository<Instructor, Long>{

    long countByUserNameAndPassword(String username, String password);

    Iterable <Instructor> findAllByUserNameContainingIgnoreCaseAndPassword(String username, String password);

    Instructor findFirstInstructorByUserName(String username);

}
