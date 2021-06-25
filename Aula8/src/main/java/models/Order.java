package models;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import enums.OrderStatus;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Order {

	private Long id;
	private Double latitude;
	private Double longitude;
	private Timestamp moment;
	private OrderStatus status;
	private Double total;
		
	private List<Product> produtos = new ArrayList<Product>();
}
