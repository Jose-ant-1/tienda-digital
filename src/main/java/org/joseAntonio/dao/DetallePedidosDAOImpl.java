package org.joseAntonio.dao;

import org.joseAntonio.model.DetallePedidos;
import org.joseAntonio.model.Pedido;

import java.util.List;
import java.util.Optional;

public class DetallePedidosDAOImpl extends AbstractDAOImpl implements DetallePedidosDAO {
    @Override
    public List<Pedido> getAll() {
        return List.of();
    }

    @Override
    public Optional<DetallePedidos> find(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Pedido pedido) {

    }

    @Override
    public void delete(int id) {

    }
}
