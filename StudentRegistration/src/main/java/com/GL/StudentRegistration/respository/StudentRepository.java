package com.GL.StudentRegistration.respository;

import org.springframework.stereotype.Repository;

import com.GL.StudentRegistration.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
