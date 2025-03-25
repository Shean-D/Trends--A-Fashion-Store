package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Order {

    private String order_id;

    private Date order_date;

    private Double total_price;

    private String payment_method;

    private List<OrderProduct> orderProducts;

    private Customer customer;
}
