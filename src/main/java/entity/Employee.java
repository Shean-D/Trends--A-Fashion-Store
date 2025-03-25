package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name = "employee")

public class Employee {

    @Id
    @Column (name = "employee_id")
    private String employee_id;

    @Column(name = "name")
    private String name;

    @Column (name = "email")
    private String email;

    @Column (name = "role")
    private String role;

}
