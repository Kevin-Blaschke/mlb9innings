package game.mlb.mlb9.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "MLB9_TEAM", schema = "MLB9INNINGS")
public class player {
   @Id
   @Column(name = "TEAM_ID")
   Long playerId; 

   @OneToOne
   @JoinColumn(name = "mlb9_club_id", referencedColumnName = "mlb9_club_id")
   club club;

   @Column(name = "TEAM_NAME")
   String playerName;

   @Column(name = "TEAM_OVERALL")
   Double teamOvr;

   @Column(name = "IS_GEARED")
   Boolean isGeared;

   @Column(name = "NUM_SIGS")
   Integer numSigs;

   @Column(name = "DIFFICULTY")
   Character difficulty;

   @Column(name = "CRD_TS")
   Timestamp crdTs;

   @Column(name = "UPD_TS")
   Timestamp updTs;
   
}

