package com.heladeriagrupo7.snowy.Interfaces;

import com.heladeriagrupo7.snowy.Model.FacturaModel;
import org.springframework.data.repository.CrudRepository;

public interface IFactura extends CrudRepository<FacturaModel, String> {

}