package com.yiidian.ssm.blog.service;

import com.yiidian.ssm.blog.entity.Options;


/**
 *
 *
 * @author 唐丫
 * 2020/10/13
 * 12:40
 */
public interface OptionsService {
    /**
     * 获得基本信息
     *
     * @return 系统设置
     */
    Options getOptions();

    /**
     * 新建基本信息
     * 
     * @param options 系统设置
     */
    void insertOptions(Options options);

    /**
     * 更新基本信息
     * 
     * @param options 系统设置
     */
    void updateOptions(Options options);
}
