package com.example.task_manager_api.service;

import com.example.task_manager_api.model.Task;
import com.example.task_manager_api.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class TaskService {
@Autowired
private TaskRepository taskRepository;

public List <Task> findAll() {
    return taskRepository.findAll();
}

public Optional<Task> findById(Long id) {
    return taskRepository.findById(id);
}

public Task createTask(Task task){
    return taskRepository.save(task);
}


public Task updateTask(Long id, Task taskDetails) {
Optional<Task> taskOptional = taskRepository.findById(id);
if (taskOptional.isPresent()) {
    Task existingTask = taskOptional.get();
    existingTask.setTitle(taskDetails.getTitle());
    existingTask.setDescription(taskDetails.getDescription());
    existingTask.setCompleted(taskDetails.isCompleted());
    return taskRepository.save(existingTask);
}else{//if the handle is not found, return nothing
    return null;
    }
}

public boolean deleteTask(Long id){
    if(taskRepository.existsById(id)){
        taskRepository.deleteById(id);
        return true;
    }
    return false;
    }
}