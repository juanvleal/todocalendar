package com.todocalendar.repositories;

import com.todocalendar.models.Todoitem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todoitem, Long> {
}
