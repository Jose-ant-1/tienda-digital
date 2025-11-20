package org.joseAntonio.dao;

import org.joseAntonio.model.Producto;

import java.util.List;
import java.util.Optional;

public class ProductoDAOImpl extends AbstractDAOImpl implements ProductoDAO {
    @Override
    public void create(Producto producto) {

    }

    @Override
    public List<Producto> getAll() {
        return List.of();
    }

    @Override
    public Optional<Producto> find(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Producto producto) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Producto> buscarCoincidencia(String coincidencia) {
        return List.of();
    }
}
