package co.edu.uceva.pais_service.model.dao;

import co.edu.uceva.pais_service.model.entities.Pais;
import org.springframework.data.repository.CrudRepository;

public interface IPaisDao extends CrudRepository<Pais, Long> { // la clase que se manejara y el tipo de llave que se utilizara

}
