package com.example.f1proyecto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

import jakarta.persistence.*;
import java.util.UUID;
@Entity
@Table(name = "file")
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID fileid;
    public String contenttype;
    @Lob
    public byte[] data;
    public File(){}
    public File(String contenttype, byte[] data) {
        this.contenttype = contenttype;
        this.data = data;
    }
}
