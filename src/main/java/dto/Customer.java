package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {

    private String customer_id;

    private String name;

    private String address;

    private int phoneNumber;

    private String email;

}
