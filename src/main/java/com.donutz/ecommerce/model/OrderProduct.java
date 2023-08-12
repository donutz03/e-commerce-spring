package main.java.com.donutz.ecommerce.model;

@Entity
public class OrderProduct {
  
  @EmbeddedId
  @JsonIgnore
  private OrderProductPK pk;
  
  @Column(nullable = false)
    private Integer quantity;

  
}
