package com.chenbo.myshop.plus.business;

/**
 * 全局业务异常
 *
 * @author : chenbo
 * @date : 2020-01-20
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 3034121940056795549L;

    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BusinessException() {

    }

    public BusinessException(BusinessStatus status) {
        super(status.getMessage());
        this.code = status.getCode();
    }
}
