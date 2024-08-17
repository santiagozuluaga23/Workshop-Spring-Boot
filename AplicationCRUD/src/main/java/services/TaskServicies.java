package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Task;
import repositories.TaskRepository;

@Service
public class TaskServicies {

    @Autowired
    static
    TaskRepository taskRepository;

    public static  List<Task> getTasks() {
        return taskRepository.findAll();
    }

    public Optional<Task> geTasks(Long id) {
        return taskRepository.findById(id);
    }

    public static void saveOrUpdate(Task task) {
        taskRepository.save(task);
    }

    public static void delete(Long id) {
        taskRepository.deleteById(id);
    }

    public static Task getTask(Long taskId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTask'");
    }
}
