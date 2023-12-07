package org.example;

public interface Subject <S>{
    void registerVisiteur(Observer<S> observer);
    void removeVisiteur(Observer<S> observer);

    void notifyVisiteur(Observer<S> observer);
}
