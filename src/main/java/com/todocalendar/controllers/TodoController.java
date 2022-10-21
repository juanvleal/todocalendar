package com.todocalendar.controllers;


import com.todocalendar.dto.TodoDto;
import com.todocalendar.form.TodoForm;
import com.todocalendar.models.Todoitem;
import com.todocalendar.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {

    @Autowired
    private TodoService service;

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public ResponseEntity<TodoDto> findById(@PathVariable Long id) {

        TodoDto obj = service.findById(id);

        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(method=RequestMethod.GET)
    public ResponseEntity<List<Todoitem>> findAll() {

        List<Todoitem> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @RequestMapping(method=RequestMethod.POST)
    public ResponseEntity<TodoDto> insert(@RequestBody TodoForm form) {

        TodoDto todoDto = service.insert(form);

        return ResponseEntity.ok().body(todoDto);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public ResponseEntity<TodoDto> update(@RequestBody TodoForm form, @PathVariable Long id) {


        TodoDto todoDto = service.update(id, form);

        return ResponseEntity.ok().body(todoDto);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        service.delete(id);

        return ResponseEntity.noContent().build();
    }
}
