package pt.folque.spring.springbootup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pt.folque.spring.springbootup.models.Sample;

/**
 * Created by Diogo on 30-Jun-15.
 */
@Repository
public interface SampleRepo extends JpaRepository<Sample, Long> {

}
