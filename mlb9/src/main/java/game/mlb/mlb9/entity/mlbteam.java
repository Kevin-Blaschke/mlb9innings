package game.mlb.mlb9.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

import java.sql.Timestamp;
import java.util.*;

@Entity
@Data
@Table(name = "MLB_TEAM", schema = "MLB9INNINGS")
public class mlbteam {
    @Column(name = "MLB_TEAM_ID")
    @Id
    Long teamId;

    @Column(name = "MB_TEAM_NAME")
    String teamName;

    @Column(name = "MLB_CITY")
    String teamCity;
}
