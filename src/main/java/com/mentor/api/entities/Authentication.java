package com.mentor.api.entities;


import lombok.*;

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
@Table(name = "authentication")
public class Authentication {

    @Id
    private Integer authId;
    private Integer personId;
    private String username;
    private String password;
    private String accessToken;
    private Date validTs;

}