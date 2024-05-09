package com.example.persona.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.persona.entities.Persona;
import org.springframework.stereotype.Repository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
