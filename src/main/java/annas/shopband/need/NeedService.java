package annas.shopband.need;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NeedService {
    @Autowired
    private NeedRepository needRepository;


    public void createNeed(){
        //elo konstruktor a nie takie G
        NeedsEntity need = new NeedsEntity();
        need.setId(1L);
        need.setName("Chleb");
        need.setNeedStatus(NeedStatus.NORMAL.toString());
        need.setProductCategory(ProductCategory.FOOD.toString());
        need.setDescription("Razowy");
        need.setParticipantId(1);
        need.setQuantity(1);
        needRepository.save(need);
    }
}
