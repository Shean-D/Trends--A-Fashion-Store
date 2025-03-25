package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Product {

    private String productName;

    private String name;

    private String category;

    private String size;

    private Double price;

    private Integer qty;

    private Supplier supplier;
}
