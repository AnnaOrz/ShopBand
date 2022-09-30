package annas.shopband.cart;

import annas.shopband.need.Need;
import lombok.Data;

import java.util.List;

@Data
public class Cart {
    private List<Need> needs;
    private String name;
    private Long id;
    private Long participantId;

}
