package annas.shopband.party;

import annas.shopband.need.Need;
import lombok.Data;

import java.util.List;

@Data
public class Party {
    private Long id;
    private List<Need> needList;
    private List<Long> participantsIds;
    private String name;

}
