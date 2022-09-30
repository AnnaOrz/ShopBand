package annas.shopband.cart;

import javax.persistence.*;

@Entity
@Table(name = "carts")
public class CartsEntity {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "participantId")
    private Integer participantId;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParticipantId() {
        return this.participantId;
    }

    public void setParticipantId(Integer participantId) {
        this.participantId = participantId;
    }
}
