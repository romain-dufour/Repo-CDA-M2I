package org.example.infra.orm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.domain.entity.User;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String userName;
    private boolean admin;

    @OneToMany(mappedBy = "userEntity")
    private List<BookingEntity> bookingEntityList;

    public User toUser() {return new User.Builder().userName(userName).admin(admin).build();}
}
