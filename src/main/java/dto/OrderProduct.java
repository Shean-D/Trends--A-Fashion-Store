package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class OrderProduct {

    private String orderProductId;

    private Order order;

    private Product product;

    private Integer quantity;
}
