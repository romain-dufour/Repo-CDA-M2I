package entity.OneToMany;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "departement")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dep_name")
    private String depName;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL , fetch = FetchType.LAZY) // Par defaut en LAZY
    //Mappedby cote many, join cote one et mettre le nom utilisé dans l'autre entité
    private List<Employee>employeeList;


    public Department() {
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", depName='" + depName + '\'' +
                ", employeeList=" + employeeList +
                '}';
    }
}
