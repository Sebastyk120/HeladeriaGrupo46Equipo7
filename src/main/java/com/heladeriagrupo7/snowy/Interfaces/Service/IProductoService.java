package com.heladeriagrupo7.snowy.Interfaces.Service;

import com.heladeriagrupo7.snowy.Model.ProductoModel;

import java.util.List;
import java.util.Optional;

public interface IProductoService {
    public List<ProductoModel> listarProductos();
    public Optional<ProductoModel> listarIdProducto(String Codigo);
    public int saveProducto (ProductoModel pr);
    public void deleteProducto (String codigo);
}
