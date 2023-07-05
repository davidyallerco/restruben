package pe.edu.galaxy.apipedidosc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.galaxy.apipedidosc.entity.Producto;

@Repository
public interface ProductoRepository  extends JpaRepository<Producto, Long>{

}
