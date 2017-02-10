/**
  * -------------------------------------------------------------------------
  * (C) Copyright Gyyx Tec Corp. 1996-2017 - All Rights Reserved
  * @版权所有：北京光宇在线科技有限责任公司
  * @项目名称：fsh-action-ui
  * @作者：fengshuhao
  * @联系方式：fengshuhao@gyyx.cn
  * @创建时间：2017年2月8日 下午3:28:04
  * @版本号：0.0.1
  *-------------------------------------------------------------------------
  */
package cn.gyyx.action.ui;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;  
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;  
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status; 
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cn.gyyx.action.service.UserService;

/**
 * <p>
 * UserControllerTest描述
 * </p>
 * 
 * @author fengshuhao
 * @since 0.0.1
 */
@WebAppConfiguration
@ContextConfiguration(
    locations = {"file:src/main/webapp/WEB-INF/spring/spring-servlet.xml","classpath:spring­servlet­test.xml"})
public class UserControllerTest extends AbstractTestNGSpringContextTests {
    /*
     * 注入spring上下文，下面基于此进行构建mock对象。
     */
    @Autowired
    protected WebApplicationContext applicationContext;
    @Autowired    
    private UserService userService;
    /**
     * 模拟测试 
     */
    private MockMvc mockMvc;

    /**
     * @Title: init 
     * @Description: 初始化参数
     * @param 
     * @return void 
     * @throws
     */
    @BeforeMethod
    public void init() {
        this.mockMvc = webAppContextSetup(this.applicationContext).build();
    }
    
    @Test(description="请求hello world时，返回状态为200，并且包含Hello world字符串。" )
    public void WhenTriggerThenReturn200HelloWorld() throws Exception  {
        when(userService.getHelloWorld()).thenReturn("Hello world");
        this.mockMvc.perform(get("/helloworld")).andDo(print()) // 打印请求日志              
        .andExpect(status().is(200)) // 期望200
        .andExpect(content().string("Hello world")); // 返回Hello world      }
    }
}
