package net.ecomapplication.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.ecomapplication.inventoryservice.entities.Product;
public interface ProductRepository extends JpaRepository <Product,String> {

}
