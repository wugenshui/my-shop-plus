package com.chenbo.myshop.plus.business.dto.params;

import lombok.Data;

import java.io.Serializable;

/**
 * 修改密码参数
 *
 * @author : chenbo
 * @date : 2020-01-27
 */
@Data
public class PasswordParam implements Serializable {

    private String username;
    private String oldPassword;
    private String newPassword;

}
