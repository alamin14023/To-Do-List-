package com.alamin.ToDoApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alamin.ToDoApp.model.ToDo;

@Repository
public interface IToDoRepo extends JpaRepository<ToDo, Long>{

}
