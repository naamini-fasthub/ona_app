package tz.co.fasthub.ona.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.social.facebook.api.AchievementType;
import tz.co.fasthub.ona.domain.Image;
import tz.co.fasthub.ona.domain.Payload;

/**
 * Created by daniel on 3/9/17.
 */
public interface ImageRepository extends PagingAndSortingRepository<Image,Long> {
    Image findByName(String name);
}