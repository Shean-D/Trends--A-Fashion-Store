package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name = "order_products")

public class OrderProduct {

    @Id
    @Column (name = "order_product_id")
    private String orderProductId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private Product product;

    @Column (name = "qty")
    private Integer quantity;
}
