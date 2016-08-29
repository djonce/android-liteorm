package com.litesuits.orm.model.cascade;

import tech.wangjie.liteorm.db.annotation.Mapping;
import tech.wangjie.liteorm.db.annotation.Table;
import tech.wangjie.liteorm.db.enums.Relation;
import com.litesuits.orm.model.Model;

/**
 * 班级
 *
 * @author MaTianyu
 * @date 2015-03-22
 */
@Table("class")
public class Classes extends Model {

    /**
     * 假设一个班级只有一个老师
     */
    @Mapping(Relation.OneToOne)
    public Teacher teacher;

    public Classes(String title) {
        super(title);
    }

    @Override public String toString() {
        return "Classes{"
               + super.toString() +
               " teacher= " + teacher +
               "} ";
    }
}
