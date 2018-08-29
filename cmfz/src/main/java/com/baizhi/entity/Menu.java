package com.baizhi.entity;

import java.io.Serializable;

public class Menu implements Serializable {
    private Integer id;
    private String title;
    private String content;
    private String iconCls;
    private Integer parentId;
    private String href;

    public Menu() {
    }

    public Menu(Integer id, String title, String content, String iconCls, Integer parentId, String href) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.iconCls = iconCls;
        this.parentId = parentId;
        this.href = href;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }


    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", iconCls='" + iconCls + '\'' +
                ", parentId=" + parentId +
                ", href='" + href + '\'' +
                '}';
    }
}


