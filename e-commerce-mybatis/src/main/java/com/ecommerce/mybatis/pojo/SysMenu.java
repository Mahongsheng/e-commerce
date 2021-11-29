package com.ecommerce.mybatis.pojo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SysMenu implements Serializable {
    private Long id;

    /**
     * 父级ID
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "父级ID")
    private Long parentId;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 菜单名称
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "菜单名称")
    private String title;

    /**
     * 菜单级数
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "菜单级数")
    private Integer level;

    /**
     * 菜单排序
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "菜单排序")
    private Integer sort;

    /**
     * 前端名称
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "前端名称")
    private String name;

    /**
     * 前端图标
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "前端图标")
    private String icon;

    /**
     * 前端隐藏
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "前端隐藏")
    private Integer hidden;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", createTime=").append(createTime);
        sb.append(", title=").append(title);
        sb.append(", level=").append(level);
        sb.append(", sort=").append(sort);
        sb.append(", name=").append(name);
        sb.append(", icon=").append(icon);
        sb.append(", hidden=").append(hidden);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}