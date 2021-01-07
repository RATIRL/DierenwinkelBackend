package trabi.ali.backend.DAO;

import org.springframework.data.repository.CrudRepository;
import trabi.ali.backend.Entities.Product;

public interface ProductDAO extends CrudRepository<Product, Integer> {
}

