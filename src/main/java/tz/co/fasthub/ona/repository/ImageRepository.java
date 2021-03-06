package tz.co.fasthub.ona.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import tz.co.fasthub.ona.domain.Image;

/**
 * Created by daniel on 3/9/17.
 */
public interface ImageRepository extends PagingAndSortingRepository<Image,Long> {
    Image findByName(String name);
}
