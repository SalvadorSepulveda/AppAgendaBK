package es.ieslosmontecillos.AppAgendaDK.Dao;

import es.ieslosmontecillos.AppAgendaDK.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaDao extends JpaRepository<Persona, Long> {
}
