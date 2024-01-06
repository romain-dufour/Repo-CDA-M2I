package dao;

import models.Account;
import models.Agency;

public interface AccountDAO {
    public boolean addAccount(Account account);
    public boolean deleteAccount(Long accountId);
}
