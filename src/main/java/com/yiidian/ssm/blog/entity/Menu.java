package com.yiidian.ssm.blog.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 唐丫
 * 2020/10/13
 * 12:40
 */
@Data
public class Menu implements Serializable {
    private static final long serialVersionUID = 489914127235951698L;
    private Integer menuId;

    private String menuName;

    private String menuUrl;

    private Integer menuLevel;

    private String menuIcon;

    private Integer menuOrder;

}