package com.chenbo.myshop.plus.business.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 登录信息
 *
 * @author : chenbo
 * @date : 2020-01-21
 */
@Data
public class LoginInfo implements Serializable {
    private String name;
    private String avatar;
    private String nickName;
}