package ca.jrvs.apps.audit.repositories.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "AUDIT_LOG")
public class AuditLog implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1l;
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "ACTIVITY_ID", nullable = false)
    private Integer activityId;
    @Column(name = "ACTIVITY", nullable = false)
    private String activity;
    @Column(name = "IP_ADDRESS", nullable = false)
    private String ipAddr;
    @Column(name = "USER_NAME", nullable = false)
    private String userName;
    @Column(name = "CREATED_TIME", nullable = false)
    private Date createdTime;

}
