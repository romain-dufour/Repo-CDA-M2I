package model;

import javax.persistence.*;

@Entity
@Table(name = "tache")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tache_id")
    private Long id;

    @Column (name = "titre")
    private String title;

    private boolean completed = false;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tache_infos_id", referencedColumnName = "id_tache_infos")
    private TaskInfos taskInfos;

    public Task() {
    }

    public Task(String title, TaskInfos taskInfos) {
        this.title = title;
        this.completed = false;
        this.taskInfos = taskInfos;
    }

    public Task(String title) {
        this.title = title;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public TaskInfos getTaskInfos() {
        return taskInfos;
    }

    public void setTaskInfos(TaskInfos taskInfos) {
        this.taskInfos = taskInfos;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                ", taskInfos=" + taskInfos +
                '}';
    }
}

