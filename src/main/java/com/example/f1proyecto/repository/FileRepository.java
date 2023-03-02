package com.example.f1proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import  com.example.f1proyecto.model.File;
import java.util.UUID;

public interface FileRepository extends JpaRepository<File, UUID> {
}
