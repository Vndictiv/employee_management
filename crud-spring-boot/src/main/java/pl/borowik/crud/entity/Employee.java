package pl.borowik.crud.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public @Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

}
