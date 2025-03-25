package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name = "Customer")

public class Customer {

    @Id
    @Column(name = "customer_id")
    private String customer_id;

    @Column (name = "name")
    private String name;

    @Column (name = "address")
    private String address;

    @Column (name = "phone_number")
    private int phoneNumber;

    @Column (name = "email")
    private String email;


}
