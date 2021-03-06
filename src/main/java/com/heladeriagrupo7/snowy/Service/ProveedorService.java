package com.heladeriagrupo7.snowy.Service;

import com.heladeriagrupo7.snowy.Interfaces.IProveedor;
import com.heladeriagrupo7.snowy.Interfaces.Service.IProveedorService;
import com.heladeriagrupo7.snowy.Model.ProveedorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorService implements IProveedorService {

    @Autowired
    private IProveedor proveedordb;

    @Override
    public List<ProveedorModel> listarProveedores() {
        return (List<ProveedorModel>)proveedordb.findAll();
    }

    @Override
    public Optional<ProveedorModel> listarIdProveedor(String nit) {
        return proveedordb.findById(nit);
    }

    @Override
    public int saveProveedor (ProveedorModel p) {
        // TODO Auto-generated method stub
        int res =0;
        ProveedorModel proveedor = proveedordb.save(p);
        if(!proveedor.equals(null)) {
            res=1;
        }
        return res;
    }

    @Override
    public void deleteProveedor (String nit) {
        proveedordb.deleteById(nit);

    }

}