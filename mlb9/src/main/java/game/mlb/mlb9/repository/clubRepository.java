package game.mlb.mlb9.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import game.mlb.mlb9.entity.club;

@Repository
public interface clubRepository extends CrudRepository<club, Long> {
    club findFirstByClubName(String clubName);
    
}
