package model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tache_infos")
public class TaskInfos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tache_infos")
    private Long id;

    private String description;

    private String date;

    @Enumerated(EnumType.STRING)
    private Priority priority;

    @OneToOne(mappedBy = "taskInfos")
    private Task task;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public TaskInfos() {
    }

    public TaskInfos(String description, String date, Priority priority) {
        this.description = description;
        this.date = date;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "TaskInfos{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", priority=" + priority +
                '}';
    }
}
