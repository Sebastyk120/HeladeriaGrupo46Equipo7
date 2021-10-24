package com.heladeriagrupo7.snowy.Interfaces.Service;

import com.heladeriagrupo7.snowy.Model.UsuarioModel;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {
    public boolean validarUsuario(String Usuario, String Clave);
    public List<UsuarioModel> listarUsuarios();
    public Optional<UsuarioModel> listarIdUsuario(String Cedula);
    public int saveUsuario (UsuarioModel u);
    public void deleteUsuario (String cedula);
}
