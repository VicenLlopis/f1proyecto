package com.example.f1proyecto.model;

import jakarta.persistence.*;

@Entity
@Table(name="authorities")
public class Authority {
    @Id
    public String username;
    public String authority;
}

