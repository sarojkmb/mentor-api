package com.mentor.api.entities;


import lombok.*;


import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "person")
public class Person {

    @Id
    private Integer personId;

    @Column
    private String firstName;

    @Column
    private String lastName;
    private Date dob;
    private String gender;

}
