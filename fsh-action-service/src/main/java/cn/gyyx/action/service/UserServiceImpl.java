/**
  * -------------------------------------------------------------------------
  * (C) Copyright Gyyx Tec Corp. 1996-2017 - All Rights Reserved
  * @版权所有：北京光宇在线科技有限责任公司
  * @项目名称：fsh-action-service
  * @作者：fengshuhao
  * @联系方式：fengshuhao@gyyx.cn
  * @创建时间：2017年2月9日 上午11:42:52
  * @版本号：0.0.1
  *-------------------------------------------------------------------------
  */
package cn.gyyx.action.service;

import org.springframework.stereotype.Service;
import cn.gyyx.action.service.UserService;
/**
  * <p>
  *   UserServiceImpl描述
  * </p>
  *  
  * @author fengshuhao
  * @since 0.0.1
  */
@Service
public class UserServiceImpl implements UserService {

    /* (non-Javadoc)
     * @see cn.gyyx.action.service.UserService#getHelloWorld()
     */
    public String getHelloWorld() {        
        return  "Hello world";
    }

}
