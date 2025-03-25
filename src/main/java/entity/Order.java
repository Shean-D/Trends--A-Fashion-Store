package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table (name = "Orders")

public class Order {

    @Id
    @Column (name = "order_id")
    private String order_id;

    @Column (name = "order_date")
    private Date order_date;

    @Column (name = "total_price")
    private Double total_price;

    @Column (name = "payment_method")
    private String payment_method;

    @OneToMany (mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderProduct> orderproducts;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    private Customer customer;
}
