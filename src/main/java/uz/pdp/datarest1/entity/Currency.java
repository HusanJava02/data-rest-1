package uz.pdp.datarest1.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.datarest1.entity.templates.AbsEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
@Entity
public class Currency extends AbsEntity {
    public Currency(Integer id, String name, Boolean active) {
        super(id, name, active);
    }
}

