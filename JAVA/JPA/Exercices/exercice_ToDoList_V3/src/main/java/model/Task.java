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

    @OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "tache_infos_id", referencedColumnName = "id_tache_infos")
    private TaskInfos taskInfos;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id") // optionnel - si non renseigne la bdd prendra le nom dans ce cas user_id
    private User user;

    public Task() {
    }


    public Task(String title, TaskInfos taskInfos, User user) {
        this.title = title;
        this.completed = false;
        this.taskInfos = taskInfos;
        this.user = user;
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

