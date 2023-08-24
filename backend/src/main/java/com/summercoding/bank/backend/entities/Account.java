package com.summercoding.bank.backend.entities;

import javax.persistence.*;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "account_id_seq")
    @SequenceGenerator(name = "account_id_seq",sequenceName = "account_id_seq",allocationSize = 1)

    private Long idAccount;
    private  double solde;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
