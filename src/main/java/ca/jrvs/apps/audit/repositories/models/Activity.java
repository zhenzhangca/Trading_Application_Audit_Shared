package ca.jrvs.apps.audit.repositories.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ACTIVITY")
public class Activity implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1l;
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "ACTIVITY", nullable = false)
    private String activity;
    @Column(name = "DESCRIPTION", nullable = false)
    private String desc;

}
