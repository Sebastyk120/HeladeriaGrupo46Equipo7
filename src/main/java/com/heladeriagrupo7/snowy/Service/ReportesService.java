package com.heladeriagrupo7.snowy.Service;

import com.heladeriagrupo7.snowy.Interfaces.IReportes;
import com.heladeriagrupo7.snowy.Interfaces.Service.IReporteService;
import com.heladeriagrupo7.snowy.Model.ReportesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportesService implements IReporteService {

    @Autowired
    private IReportes reportesdb;

    @Override
    public List<ReportesModel> listarVentasClientes(){
        return (List<ReportesModel>) reportesdb.findAll();
    }
}
