/**
  * -------------------------------------------------------------------------
  * (C) Copyright Gyyx Tec Corp. 1996-2017 - All Rights Reserved
  * @版权所有：北京光宇在线科技有限责任公司
  * @项目名称：fsh-action-ui
  * @作者：fengshuhao
  * @联系方式：fengshuhao@gyyx.cn
  * @创建时间：2017年2月8日 下午3:19:08
  * @版本号：0.0.1
  *-------------------------------------------------------------------------
  */
package cn.gyyx.action.ui;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.gyyx.action.service.UserService;

/**
 * <p>
 * UserController描述
 * </p>
 * 
 * @author fengshuhao
 * @since 0.0.1
 */
@Controller
public class UserController {
    /**
     * 日志记录
     */
    private static final Logger LOGGER = LoggerFactory
            .getLogger(UserController.class);
    /**
     * 用户业务操作
     */
    private UserService userService;

    /**
     *@return the userService
     */
    public UserService getUserService() {
        return userService;
    }

    /**
     * @param userService the userService to set
     */
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /**
     * 
     * hello world
     * 
     * @return
     */
    @RequestMapping("/helloworld")
    @ResponseBody
    public String helloworld() {

        LOGGER.info("hello world.");
        return userService.getHelloWorld();
    }
}