/**
  * -------------------------------------------------------------------------
  * (C) Copyright Gyyx Tec Corp. 1996-2017 - All Rights Reserved
  * @版权所有：北京光宇在线科技有限责任公司
  * @项目名称：fsh-action-ui
  * @作者：fengshuhao
  * @联系方式：fengshuhao@gyyx.cn
  * @创建时间：2017年2月10日 下午4:14:22
  * @版本号：0.0.1
  *-------------------------------------------------------------------------
  */
package cn.gyyx.action.ui;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.gyyx.action.beans.ResultBean;
import cn.gyyx.action.beans.UserInfo;
import cn.gyyx.action.beans.WdPkRoleBindBean;
import cn.gyyx.action.service.BindInfoServer;

/**
 * class
 * <p>
 * UserInfoBindController描述：绑定用户信息
 * </p>
 * 
 * @author fengshuhao
 * @since 0.0.1
 */
public class UserInfoBindController {
    /**
     * 日志记录
     */
    private static final Logger LOGGER = LoggerFactory
            .getLogger(UserController.class);
    private static final int ACTION_CODE = 439;
private BindInfoServer xwbValentineDayServer=new BindInfoServer();
    /**
     * <p>
     * 绑定用户信息
     * </p>
     *
     * @action 冯书浩 2017-02-10 16:23 添加绑定用户信息操作
     * @see http://内网api接口地址
     * 
     * @param WdPkRoleBindBean
     * @return ResultBean<WdPkRoleBindBean>
     * @deprecated ... ...
     */
    @RequestMapping("/bind")
    @ResponseBody
    public ResultBean<WdPkRoleBindBean> bind(HttpServletRequest request,
            WdPkRoleBindBean wdPkRoleBindBean) {
        ResultBean<WdPkRoleBindBean> result = new ResultBean<WdPkRoleBindBean>(
                false, "未知错误", null);
        // 用户信息
        UserInfo userInfo = null;
        try {
            userInfo = SignedUser.getUserInfo(request);
            if (userInfo == null) {
                result.setProperties(false, "登录超时，请重新登录哟", null);
                return result;
            }
            wdPkRoleBindBean.setAccount(userInfo.getAccount());
            wdPkRoleBindBean.setUserId(userInfo.getUserId());
            wdPkRoleBindBean.setCreateAt(new Date());
            wdPkRoleBindBean.setActionCode(ACTION_CODE);
            result = xwbValentineDayServer.doBind(wdPkRoleBindBean);
            return result;
        } catch (Exception e) {
            LOGGER.error("炫舞吧2017情人节获取服务器出现异常", e);
            return new ResultBean<>(false, "网络繁忙，请稍后再试哦", null);
        }
    }

}
