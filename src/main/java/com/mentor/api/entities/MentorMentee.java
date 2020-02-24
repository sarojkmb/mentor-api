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
@Table(name = "mentor_mentee")
public class MentorMentee {

    @Id
    private Integer mmId;

    @Column
    private Integer mentorId;

    @Column
    private Integer expertiseId;

    private boolean activeInd;

}
