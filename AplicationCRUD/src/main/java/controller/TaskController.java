package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskRejectedException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import entity.Task;
import jakarta.annotation.PostConstruct;
import repositories.TaskRepository;
import services.TaskServicies;

@RestController
@RequestMapping(path = "api/v1/task")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping
    public List<Task> getAll() {
        return TaskServicies.getTasks();

    }

    @GetMapping("/{taskId}")
    public Task getById(@PathVariable("taskId") Long taskId) {
        return TaskServicies.getTask(taskId);

    }

    @PostMapping
    public void saveUpdate(@RequestBody Task task) {
        TaskServicies.saveOrUpdate(task);
    }

    @DeleteMapping("/{taskId}")
    public void delete(@PathVariable("taskId") Long taskId) {
        TaskServicies.delete(taskId);
    }
}
