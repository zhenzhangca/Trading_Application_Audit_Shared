package ca.jrvs.apps.audit.web.resources;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuditLogResponse{

    private Integer id;
    private Integer activityId;
    private String activity;
    private String ipAddr;
    private String userName;
    private Date createdTime;

}
