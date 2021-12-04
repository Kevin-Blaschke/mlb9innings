package game.mlb.mlb9.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import game.mlb.mlb9.entity.club;
import game.mlb.mlb9.entity.player;

@Repository
public interface playerRepository extends CrudRepository<player, Long> {
    List<player> findByClub(club club);
}
