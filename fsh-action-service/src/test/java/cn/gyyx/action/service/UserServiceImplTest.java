/**
  * -------------------------------------------------------------------------
  * (C) Copyright Gyyx Tec Corp. 1996-2017 - All Rights Reserved
  * @版权所有：北京光宇在线科技有限责任公司
  * @项目名称：fsh-action-service
  * @作者：fengshuhao
  * @联系方式：fengshuhao@gyyx.cn
  * @创建时间：2017年2月9日 下午1:25:04
  * @版本号：0.0.1
  *-------------------------------------------------------------------------
  */
package cn.gyyx.action.service;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

/**
 * <p>
 * UserServiceImplTest描述
 * </p>
 * 
 * @author fengshuhao
 * @since 0.0.1
 */
public class UserServiceImplTest {
    private UserServiceImpl userService;

    @Test(description = "helloworld方法返回字符串\"Hello world\"")
    public void whenGetHelloWorldThenReturnHelloworld() {
        userService = new UserServiceImpl();
        assertEquals("Hello world", userService.getHelloWorld());
    }
}
