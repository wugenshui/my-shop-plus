package com.chenbo.myshop.plus.business.dto.params;

import lombok.Data;

import java.io.Serializable;

/**
 * 修改头像参数
 *
 * @author : chenbo
 * @date : 2020-01-27
 */
@Data
public class IconParam implements Serializable {

    /**
     * 用户名
     */
    private String username;

    /**
     * 头像地址
     */
    private String path;

}
