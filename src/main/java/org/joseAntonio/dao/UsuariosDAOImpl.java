package org.joseAntonio.dao;

import org.joseAntonio.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Optional;

public class UsuariosDAOImpl extends AbstractDAOImpl implements UsuariosDAO {
    @Override
    public void create(Usuario usuario) {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ResultSet rsGenKeys = null;

    }

    @Override
    public List<Usuario> getAll() {
        return List.of();
    }

    @Override
    public Optional<Usuario> find(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Usuario usuario) {

    }

    @Override
    public void delete(int id) {

    }
}
