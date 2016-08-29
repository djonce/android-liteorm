package com.litesuits.orm.model.single;

import tech.wangjie.liteorm.db.annotation.Column;
import tech.wangjie.liteorm.db.annotation.Conflict;
import tech.wangjie.liteorm.db.annotation.NotNull;
import tech.wangjie.liteorm.db.annotation.PrimaryKey;
import tech.wangjie.liteorm.db.enums.AssignType;
import tech.wangjie.liteorm.db.enums.Strategy;

/**
 *
 * @author MaTianyu
 * 2014-3-7上午10:39:45
 */
public class Person extends BaseModel {
    @PrimaryKey(AssignType.AUTO_INCREMENT)
    @Column("_id")
    protected long id;

    @NotNull
    @Conflict(Strategy.FAIL)
    public String name;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }
}
