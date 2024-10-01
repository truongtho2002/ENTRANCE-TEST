package Name.com.example.productlisting.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Name.com.example.productlisting.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
