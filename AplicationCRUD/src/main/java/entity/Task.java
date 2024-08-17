package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "task") 
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(length = 255, nullable = true)
    private String description;

    @Column(nullable = false)
    private Date date_creation;

    @Column(nullable = false)
    private Time time_creation;

    @Column(length = 50, nullable = false)
    private String state;
    
    public Task() {
    }

    public Task(Integer id, String title, String description, Date date_creation, Time time_creation, String state) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date_creation = date_creation;
        this.time_creation = time_creation;
        this.state = state;
    }

    public Integer getId() {
        return (int) id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }

    public Time getTime_creation() {
        return time_creation;
    }

    public void setTime_creation(Time time_creation) {
        this.time_creation = time_creation;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Task [id=" + id + ", title=" + title + ", description=" + description + ", date_creation="
                + date_creation + ", time_creation=" + time_creation + ", state=" + state + "]";
    }

}
