package es.ieslosmontecillos.AppAgendaDK.Dao;

import es.ieslosmontecillos.AppAgendaDK.Entity.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProvinciaDao extends JpaRepository<Provincia, Long> {
}
