package com.example.usermanagement.User;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class User {

    @Id
    private long Id;
    private String Name;

}
