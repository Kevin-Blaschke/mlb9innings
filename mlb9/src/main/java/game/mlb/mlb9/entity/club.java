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
@Table(name = "MLB9_CLUB", schema = "MLB9INNINGS")
public class club {
    @Id
    @Column(name = "MLB9_CLUB_ID")
    Long clubId;

    @Column(name = "CLUB_NAME")
    String clubName;

    @Column(name = "CLUB_OVERALL")
    Double clubOvr;

    @Column(name = "CRD_TS")
    Timestamp crdTs;

    @Column(name = "UPD_TS")
    Timestamp updTs;
   
}
