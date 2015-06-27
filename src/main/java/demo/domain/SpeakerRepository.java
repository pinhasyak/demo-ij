package demo.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;

/**
 * Created by pinhas on 6/26/15.
 */
public interface SpeakerRepository extends CrudRepository<Speaker,Long> {

    @RestResource(path = "by-twitter")
    Speaker findByTwitter(@Param("id")String twitter);


    Collection<Speaker> findByLastName(@Param("name")String lastName);
}
