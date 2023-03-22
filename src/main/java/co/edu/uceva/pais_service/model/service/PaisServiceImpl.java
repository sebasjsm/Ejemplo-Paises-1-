package co.edu.uceva.pais_service.model.service;

import co.edu.uceva.pais_service.model.dao.IPaisDao;
import co.edu.uceva.pais_service.model.entities.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  clase implementa el servicio de pais
 *  un servicio es un objeto controlado por el contenedor de Spring
 */
@Service
public class PaisServiceImpl implements IPaisService{

    @Autowired
    IPaisDao paisDao;

    @Override
    public Pais save(Pais pais) {
        return null;
    }

    @Override
    public void delete(Pais pais) {

    }

    @Override
    public Pais update(Pais pais) {
        return null;
    }

    /**
     * Este metodo lista los paises guardados
     * @return una lista de paises
     */
    @Override
    public List<Pais> findAll() { //esto lista
        return (List<Pais>) paisDao.findAll();
    }

    @Override
    public Pais findById(Long id) {
        return (Pais) paisDao.findById(id).get();
    }
}
