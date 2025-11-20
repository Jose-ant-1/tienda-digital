package org.joseAntonio.dao;

import org.joseAntonio.model.DetallePedidos;
import org.joseAntonio.model.Pedido;

import java.sql.*;
import java.util.List;
import java.util.Optional;

public class DetallePedidosDAOImpl extends AbstractDAOImpl implements DetallePedidosDAO {
    @Override
    public void create(DetallePedidos detallePedidos) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ResultSet rsGenKey = null;

        try {
            conn = connectDB();
            ps = conn.prepareStatement("INSERT INTO detalle_pedidos VALUES (?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);

            int idx = 1;
            ps.setInt(idx++, detallePedidos.getId());
            ps.setInt(idx++, detallePedidos.getPedidoId());
            ps.setInt(idx++, detallePedidos.getProductoId());
            ps.setInt(idx++, detallePedidos.getCantidad());
            ps.setDouble(idx++, detallePedidos.getPrecio());

            int rows = ps.executeUpdate();
            if (rows == 0)
                System.out.println("INSERT de detallePedidos con 0 filas insertadas");
            rsGenKey = ps.getGeneratedKeys();
            if (rsGenKey.next())
                detallePedidos.setId(rsGenKey.getInt(1));

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            closeDb(conn, ps, rs);
        }
    }

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
