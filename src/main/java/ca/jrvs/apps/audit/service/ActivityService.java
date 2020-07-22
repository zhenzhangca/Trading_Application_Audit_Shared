package ca.jrvs.apps.audit.service;

import ca.jrvs.apps.audit.web.resources.ActivityResponse;

import java.util.List;

public interface ActivityService {

    List<ActivityResponse> getActivityList();
}
