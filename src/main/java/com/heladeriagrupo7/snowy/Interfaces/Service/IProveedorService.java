package com.heladeriagrupo7.snowy.Interfaces.Service;

import com.heladeriagrupo7.snowy.Model.ProveedorModel;

import java.util.List;
import java.util.Optional;

public interface IProveedorService {

    public List<ProveedorModel> listarProveedores();
    public Optional<ProveedorModel> listarIdProveedor(String nit);
    public int saveProveedor (ProveedorModel p);
    public void deleteProveedor (String nit);
}
