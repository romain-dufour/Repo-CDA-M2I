package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "agence")
public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "adresse")
    private String adress;

    @OneToMany(mappedBy = "agency",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Account> accountList;

    public Agency() {
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
