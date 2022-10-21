package com.todocalendar.services;

import com.todocalendar.dto.TodoDto;
import com.todocalendar.form.TodoForm;
import com.todocalendar.models.Todoitem;
import com.todocalendar.repositories.TodoRepository;
import com.todocalendar.services.exceptions.EmptyResultDataAccessException;
import com.todocalendar.services.exceptions.ResourceNotFoundException;
import com.todocalendar.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
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
        entity.setConclusionDate(Utils.parse(form.getConclusionDate()));
        entity.setFinishDate(Utils.parse(form.getFinishDate()));
        entity = todoRepository.save(entity);
        return new TodoDto(entity);
    }

    public TodoDto findById(Long id){
        Optional<Todoitem> obj= todoRepository.findById(id);
        Todoitem entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
        return new TodoDto(entity);
    }

    public List<Todoitem> findAll() {
        return todoRepository.findAll();
    }

    @Transactional
    public TodoDto update(Long id, TodoForm form){
        Todoitem entity = todoRepository.getReferenceById(id);
        entity.setTitle(form.getTitle());
        entity.setDescription(form.getDescription());
        entity.setDone(form.isDone());
        entity.setConclusionDate(Utils.parse(form.getConclusionDate()));
        entity.setFinishDate(Utils.parse(form.getFinishDate()));
        entity.setDurationTime(entity.getFinishDate(), entity.getConclusionDate());
        entity = todoRepository.save(entity);
        return new TodoDto(entity);
    }

    public void delete(Long id){
        try {
            findById(id);
            todoRepository.deleteById(id);
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException("Id not found to delete");
        } catch (EmptyResultDataAccessException e) {
            throw new EmptyResultDataAccessException("Empty search result");
        }
    }


}
