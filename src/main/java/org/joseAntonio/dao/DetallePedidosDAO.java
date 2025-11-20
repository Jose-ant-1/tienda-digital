package org.joseAntonio.dao;

import org.joseAntonio.model.DetallePedidos;
import org.joseAntonio.model.Pedido;

import java.util.List;
import java.util.Optional;

public interface DetallePedidosDAO {
    public void create(DetallePedidos detallePedidos);
    public List<Pedido> getAll();
    public Optional<DetallePedidos> find(int id);
    public void update(Pedido pedido);
    public void delete(int id);

}
