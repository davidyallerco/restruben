package pe.edu.galaxy.apipedidosc.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.galaxy.apipedidosc.entity.Producto;
import pe.edu.galaxy.apipedidosc.repository.ProductoRepository;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	private ProductoRepository productoRepository;

	@GetMapping
	public Producto getProducto() {
		return Producto.builder().id(80L).nombre("Televisor Samsumg").precio(2200.0).stock(20).build();
	}
	
	
	@GetMapping("/listado")
	public List<Producto> getAll() {

		List<Producto> lista = new ArrayList<Producto>();
		lista.add(Producto.builder().id(80L).nombre("Televisor Samsumg").precio(2200.0).stock(20).build());
		lista.add(Producto.builder().id(81L).nombre("Televisor LG").precio(2100.0).stock(20).build());
		lista.add(Producto.builder().id(82L).nombre("Televisor Daewo").precio(2500.0).stock(20).build());
		lista.add(Producto.builder().id(83L).nombre("Televisor Huawei").precio(2000.0).stock(20).build());
		return lista;
	}
	
	@PostMapping()
	public Producto registrar(@RequestBody Producto producto) {
		return productoRepository.save(producto);
	}
	
	
	
	
	
}
