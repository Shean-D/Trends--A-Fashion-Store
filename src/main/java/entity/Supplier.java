package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table (name = "Supplier")

public class Supplier {

    @Id
    @Column (name = "supplier_id")
    private String supplier_id;

    @Column (name = "name")
    private String name;

    @Column (name = "company")
    private String company;

    @Column (name = "email")
    private String email;
}
