package main.java.com.donutz.ecommerce.controller;


@RestController
@RequestMapping("/api/products")
public class ProductController {
  
  @GetMapping(value = { "", "/"})
  public @NotNull Iterable<Product> getProducts() {
    return productService.getAllProducts();
  }
}
