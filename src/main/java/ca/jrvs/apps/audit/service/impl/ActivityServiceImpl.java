package ca.jrvs.apps.audit.service.impl;

import ca.jrvs.apps.audit.repositories.ActivityRepository;
import ca.jrvs.apps.audit.repositories.models.Activity;
import ca.jrvs.apps.audit.service.ActivityService;
import ca.jrvs.apps.audit.web.resources.ActivityResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("ActivityServiceImpl")
@Slf4j
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityRepository activityRepo;

    @Override
    public List<ActivityResponse> getActivityList() {
        List<Activity> activityList = activityRepo.findAll();
        List<ActivityResponse> responses = new ArrayList<>();
        activityList.stream().forEach(i->{
            ActivityResponse response = convertActivity(i);
            responses.add(response);
        });
        return responses;
    }

    private ActivityResponse convertActivity(Activity model) {
        return ActivityResponse.builder()
                .id(model.getId())
                .activity(model.getActivity())
                .desc(model.getDesc())
                .build();
    }
}
