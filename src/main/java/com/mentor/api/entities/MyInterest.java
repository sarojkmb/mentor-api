package com.mentor.api.entities;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "my_interest")
public class MyInterest {

    @Id
    private Integer myInterestId;

    @Column(name = "person_id")
    private Integer personId;

    @Column
    private Integer interestId;

}
