package com.mentor.api.entities;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "expertise")
public class Expertise {

    @Id
    private Integer expertiseId;

    @Column(name = "expertise_name")
    private String expertiseName;

    @Column
    private String expertise_area;

}
