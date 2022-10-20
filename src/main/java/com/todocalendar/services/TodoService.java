package com.todocalendar.services;

import com.todocalendar.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;




}
