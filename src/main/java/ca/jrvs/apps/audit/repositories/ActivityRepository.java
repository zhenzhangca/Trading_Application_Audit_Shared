package ca.jrvs.apps.audit.repositories;

import ca.jrvs.apps.audit.repositories.models.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Integer> {

    @Override
    List<Activity> findAll();
}
