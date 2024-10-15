package service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wallacearthur7.desafio_todolist.entity.Todo;
import com.wallacearthur7.desafio_todolist.repository.TodoRepository;

@Service
public class TodoService {
    
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> list() {       
        return todoRepository.findAll();
    }

    public List<Todo> update(Todo todo) {
        todoRepository.save(todo);
        return list();
    }
    public List<Todo> delete(Long id) {
        todoRepository.deleteById(id);
        return list();
    }
   

}
