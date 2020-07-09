package ca.jrvs.apps.audit.web.resources;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivityResponse {

    private Integer id;
    private String activity;
    private String desc;

}
