package uz.pdp.datarest1.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.datarest1.entity.templates.AbsEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Warehouse extends AbsEntity {

}
