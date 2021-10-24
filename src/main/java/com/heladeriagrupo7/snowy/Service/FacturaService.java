package com.heladeriagrupo7.snowy.Service;

import com.heladeriagrupo7.snowy.Interfaces.IFactura;
import com.heladeriagrupo7.snowy.Interfaces.Service.IFacturaService;
import com.heladeriagrupo7.snowy.Model.FacturaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaService implements IFacturaService {

    @Autowired
    private IFactura facturadb;

    @Override
    public int saveFactura (FacturaModel f) {
        // TODO Auto-generated method stub
        int res =0;
        FacturaModel factura = facturadb.save(f);
        if(!factura.equals(null)) {
            res=1;
        }
        return res;
    }

}
