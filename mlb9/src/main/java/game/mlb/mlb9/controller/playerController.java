package game.mlb.mlb9.controller;

import java.util.List;

import org.aspectj.weaver.Lint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import game.mlb.mlb9.entity.club;
import game.mlb.mlb9.entity.player;
import game.mlb.mlb9.repository.clubRepository;
import game.mlb.mlb9.repository.playerRepository;


@RestController
@RequestMapping("/player")
public class playerController {

    clubRepository clubRepository;
    playerRepository playerRepository;

    @Autowired
    public playerController(clubRepository clubRepository, playerRepository playerRepository) {
        this.clubRepository = clubRepository;
        this.playerRepository = playerRepository;
    }
    
    @GetMapping("/{name}")
    public String getPlayerByName(@PathVariable(name = "name") String name) {
        return "Some random name";
    }

    @GetMapping(value="/club")
    public List<player> getPlayersByClub(@RequestParam(name = "club") String clubName) throws Exception {
        club club = clubRepository.findFirstByClubName(clubName);
        if (club != null) {
            return playerRepository.findByClub(club);
        }
        throw new Exception("No info for this club");
    }
}
