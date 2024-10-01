package Name.com.example.productlisting.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Name.com.example.productlisting.entity.Color;

@Repository
public interface ColorRepository extends JpaRepository<Color, Long> {
}
