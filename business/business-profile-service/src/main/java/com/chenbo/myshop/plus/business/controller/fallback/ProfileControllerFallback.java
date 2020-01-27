package com.chenbo.myshop.plus.business.controller.fallback;

import com.chenbo.myshop.plus.business.dto.UmsAdminDTO;
import com.chenbo.myshop.plus.business.feign.fallback.ProfileFeignFallback;
import com.chenbo.myshop.plus.commons.dto.ResponseResult;
import lombok.extern.slf4j.Slf4j;

/**
 * 用户管理服务熔断器
 *
 * @author : chenbo
 * @date : 2020-01-27
 */
@Slf4j
public class ProfileControllerFallback {

    /**
     * 熔断方法
     *
     * @param username {@code String} 用户名
     * @return {@link ResponseResult<UmsAdminDTO>}
     */
    public static ResponseResult<UmsAdminDTO> infoFallback(String username, Throwable ex) {
        log.warn("Invoke infoFallback: " + ex.getClass().getTypeName());
        ex.printStackTrace();
        return new ResponseResult<UmsAdminDTO>(ResponseResult.CodeStatus.BREAKING, ProfileFeignFallback.BREAKING_MESSAGE);
    }

}

