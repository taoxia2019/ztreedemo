package com.chord.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lena
 * @since 2019-03-23
 */
public class Ztreedemo extends Model<Ztreedemo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String name;
    private Integer pid;
    private boolean isParent;

    public boolean isOpen() {
        return open;
    }

    @Override
    public String toString() {
        return "Ztreedemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pid=" + pid +
                ", isParent=" + isParent +
                ", open=" + open +
                ", checked=" + checked +
                '}';
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    private  boolean open;
    private  boolean checked;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public boolean getIsParent() {
        return isParent;
    }

    public void setIsparent(boolean isParent) {
        this.isParent = isParent;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }


}
