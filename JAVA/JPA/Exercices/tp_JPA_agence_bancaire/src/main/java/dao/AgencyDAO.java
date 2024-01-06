package dao;

import models.Agency;

public interface AgencyDAO {
    public boolean addAgency(Agency agency);
    public boolean deleteAgency(Long agencyId);
}
