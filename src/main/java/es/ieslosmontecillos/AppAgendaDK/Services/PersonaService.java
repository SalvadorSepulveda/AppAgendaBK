package es.ieslosmontecillos.AppAgendaDK.Services;

import es.ieslosmontecillos.AppAgendaDK.Entity.Persona;
import java.util.List;

public interface PersonaService {
    List<Persona> findAll();
    Persona save(Persona persona);
    Persona findById(Long id);
    void delete(Persona persona);
}
