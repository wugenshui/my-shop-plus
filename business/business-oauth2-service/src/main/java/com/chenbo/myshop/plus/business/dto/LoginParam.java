package com.chenbo.myshop.plus.business.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 登录参数
 *
 * @author : chenbo
 * @date : 2020-01-21
 */
@Data
public class LoginParam implements Serializable {

    private String username;
    private String password;

}
