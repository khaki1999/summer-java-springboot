package com.summercoding.bank.backend.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_id_seq")
    @SequenceGenerator(name = "user_id_seq",sequenceName = "user_id_seq",allocationSize = 1)
    private Long iduser;
    private String login;
    private String password;
    private String nom;
    private LocalDate dateNaiss;
    @OneToMany(mappedBy = "user")
    private List<Account> accounts;

}
