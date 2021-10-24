package com.heladeriagrupo7.snowy.Interfaces;

import com.heladeriagrupo7.snowy.Model.ClienteModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICliente extends CrudRepository<ClienteModel, String> {

}
