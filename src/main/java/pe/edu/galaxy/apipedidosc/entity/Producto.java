package pe.edu.galaxy.apipedidosc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity(name="Producto")
@Table(name="PRODUCTO")
public class Producto {
	
	

	@Id
	@Column(name = "PRODUCTO_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqProducto")
	@SequenceGenerator(sequenceName = "SEQ_PRODUCTO", allocationSize = 1, name = "seqProducto")
	private Long id;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "PRECIO")
	private Double precio;
	
	@Column(name = "STOCK")
	private Integer stock;
	
	@Column(name = "ESTADO")
	private String estado;
}
