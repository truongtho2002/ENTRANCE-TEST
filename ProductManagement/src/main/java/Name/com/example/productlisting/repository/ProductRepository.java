package Name.com.example.productlisting.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import Name.com.example.productlisting.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
