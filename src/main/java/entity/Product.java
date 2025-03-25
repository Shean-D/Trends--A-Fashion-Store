package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table (name = "Product")
public class Product {

    @Id
    @Column (name = "product_id")
    private String product_id;

    @Column(name = "name")
    private String name;

    @Column (name = "category")
    private String category;

    @Column (name = "size")
    private String size;

    @Column (name = "price")
    private Double price;

    @Column (name = "qty")
    private Integer qty;

    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "supplier_id", referencedColumnName = "supplier_id")
    private Supplier supplier;
}
