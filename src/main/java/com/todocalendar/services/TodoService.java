package com.todocalendar.services;

import com.todocalendar.dto.TodoDto;
import com.todocalendar.form.TodoForm;
import com.todocalendar.models.Todoitem;
import com.todocalendar.repositories.TodoRepository;
import com.todocalendar.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Transactional
    public TodoDto insert(TodoForm form){
        Todoitem entity = new Todoitem();
        entity.setTitle(form.getTitle());
        entity.setDescription(form.getDescription());
        entity.setDone(form.isDone());
        entity = todoRepository.save(entity);
        return new TodoDto(entity);
    }

    public TodoDto findById(Long id){
        Optional<Todoitem> obj= todoRepository.findById(id);
        Todoitem entity = obj.orElseThrow(() -> new ResourceNotFoundException()
    }


}
