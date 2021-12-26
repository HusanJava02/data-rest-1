package uz.pdp.datarest1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.datarest1.entity.templates.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Category extends AbsEntity {
    @ManyToOne
    private Category parentCategory;

    public Category(Integer id, String name, Boolean active, Category parentCategory) {
        super(id, name, active);
        this.parentCategory = parentCategory;
    }
}


