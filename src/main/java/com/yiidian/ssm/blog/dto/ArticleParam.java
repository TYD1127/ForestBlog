package com.yiidian.ssm.blog.dto;

import lombok.Data;

import java.util.List;

/**
 * @author 唐丫
 * 2020/10/13
 * 12:40
 */
@Data
public class ArticleParam {

    private Integer articleId;

    private String articleTitle;

    private String articleContent;

    private Integer articleParentCategoryId;

    private Integer articleChildCategoryId;

    private Integer articleOrder;

    private Integer articleStatus;

    private List<Integer> articleTagIds;

}
