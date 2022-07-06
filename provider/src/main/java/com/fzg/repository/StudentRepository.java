package com.fzg.repository;

import com.fzg.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;

public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(Integer id);
    public void saveOrUpdate(Student student);
    public void deleteById(Integer id);
}
