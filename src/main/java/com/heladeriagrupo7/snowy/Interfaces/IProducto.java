package com.heladeriagrupo7.snowy.Interfaces;

import com.heladeriagrupo7.snowy.Model.ProductoModel;
import org.springframework.data.repository.CrudRepository;

public interface IProducto extends CrudRepository<ProductoModel, String> {

}
