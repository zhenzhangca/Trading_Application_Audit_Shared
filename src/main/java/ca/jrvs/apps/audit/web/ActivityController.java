package ca.jrvs.apps.audit.web;

import ca.jrvs.apps.audit.service.ActivityService;
import ca.jrvs.apps.audit.util.ResponseExceptionUtil;
import ca.jrvs.apps.audit.web.resources.ActivityResponse;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Validated
@RestController
@RequestMapping(value = "/api/v1/trading/auditlog")
@Api(value = "activity")
@Slf4j
public class ActivityController {
    @Autowired
    private ActivityService activityService;

    @GetMapping(path = "/activity", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "Show the list of activity", notes = "Show the list of activity.",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE, responseContainer = "List", response = ActivityResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Request completes successfully."),
            @ApiResponse(code = 404, message = "Not found."),
            @ApiResponse(code = 500, message = "Internal Server Error.")
    })
    public ResponseEntity<?> getActivityList() {
        try {
            List<ActivityResponse> responses = activityService.getActivityList();
            return ResponseEntity
                    .ok()
                    .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .body(responses);
        } catch (Exception e) {
            throw ResponseExceptionUtil.getResponseStatusException(e);
        }
    }
}
