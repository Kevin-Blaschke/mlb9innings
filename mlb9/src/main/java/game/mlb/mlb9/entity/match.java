package game.mlb.mlb9.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

import java.sql.Timestamp;
import java.util.*;

@Entity
@Data
@Table(name = "MATCHES", schema = "MLB9INNINGS")
public class match {
    @Id
    @Column(name = "MATCH_ID")
    Long matchId;

    @OneToOne
    @JoinColumn(name = "OPPONENT_ID", referencedColumnName = "MLB9_CLUB_ID")
    club opponentClub;

    @Column(name = "FLAG_REACHED")
    Boolean flagReached;

    @Column(name = "MATCH_DATE")
    Date matchDate;

    @Column(name = "CRD_TS")
    Timestamp crdTs;

}
