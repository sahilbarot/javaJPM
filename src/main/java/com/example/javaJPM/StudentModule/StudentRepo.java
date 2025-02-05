package com.example.javaJPM.StudentModule;

import org.springframework.data.repository.CrudRepository;


public interface StudentRepo extends CrudRepository<Student, String>
{
   //   findAll()         ;    select
   //   findByID(String)  :    select with whare clause
   //   save()   : insert
   //  save(student)   update
   //  delete(pk)    delete
}
