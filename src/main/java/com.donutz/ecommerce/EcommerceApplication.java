package main.java.com.donutz.ecommerce;

public class EcommerceApplication {
  

  @Bean
  CommandLineRunner runner(ProductService productService) {
    return args -> {
      productService.save(...);
    };
  }
}
