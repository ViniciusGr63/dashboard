package com.example.ptf.contollers;

import com.example.ptf.models.Product;
import com.example.ptf.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // GET all 
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // // GET a product by ID
    // @GetMapping("/{id}")
    // public ResponseEntity<Product> getProductById(@PathVariable Long id) {
    //     return productService.getProductById(id)
    //             .map(ResponseEntity::ok)
    //             .orElse(ResponseEntity.notFound().build());
    // }

    // // POST a new product
    // @PostMapping
    // public Product createProduct(@RequestBody Product product) {
    //     return productService.createProduct(product);
    // }

    // // PUT (update) a product
    // @PutMapping("/{id}")
    // public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product) {
    //     return productService.updateProduct(id, product)
    //             .map(ResponseEntity::ok)
    //             .orElse(ResponseEntity.notFound().build());
    // }

    // // DELETE a product
    // @DeleteMapping("/{id}")
    // public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
    //     if (productService.deleteProduct(id)) {
    //         return ResponseEntity.noContent().build();
    //     } else {
    //         return ResponseEntity.notFound().build();
    //     }
    // }
}
