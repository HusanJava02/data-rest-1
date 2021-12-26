package uz.pdp.datarest1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.datarest1.entity.templates.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Supplier extends AbsEntity {
    @Column(unique = true,nullable = false)
    private String phoneNumber;

    public Supplier(Integer id, String name, Boolean active, String phoneNumber) {
        super(id, name, active);
        this.phoneNumber = phoneNumber;
    }
}
