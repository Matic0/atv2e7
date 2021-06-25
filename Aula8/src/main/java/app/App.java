package app;

import java.sql.SQLException;
import repositories.OrderRepository;

public class App {
	
	
	public static void main(String[] args) throws SQLException {
		
		OrderRepository repo = new OrderRepository();
		
		repo.findAll();
			
	}

}
