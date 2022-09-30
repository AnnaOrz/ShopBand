package annas.shopband.need;

import javax.persistence.*;

@Entity
@Table(name = "needs")
public class NeedsEntity {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "need_status")
    private String needStatus;

    @Column(name = "product_category")
    private String productCategory;

    @Column(name = "description")
    private String description;

    @Column(name = "participant_id")
    private Integer participantId;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getNeedStatus() {
        return this.needStatus;
    }

    public void setNeedStatus(String needStatus) {
        this.needStatus = needStatus;
    }

    public String getProductCategory() {
        return this.productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getParticipantId() {
        return this.participantId;
    }

    public void setParticipantId(Integer participantId) {
        this.participantId = participantId;
    }
}
