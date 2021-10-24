package com.heladeriagrupo7.snowy.Interfaces;

import com.heladeriagrupo7.snowy.Model.ProveedorModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProveedor extends CrudRepository<ProveedorModel, String> {

}
