package annas.shopband.need;

import lombok.Data;

import java.util.List;

@Data
public class Need extends Product{
    private Long id;
    private String description;
    private int quantity;
    private NeedStatus needStatus;
    private List<String> comments;
    private Long participantId;
}
