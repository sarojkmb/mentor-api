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
@Table(name = "interest")
public class Interest {

    @Id
    private Integer interestId;

    @Column(name = "interest_name")
    private String interestName;

    @Column
    private String interest_area;

}
