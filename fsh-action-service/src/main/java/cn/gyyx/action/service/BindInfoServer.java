/**
  * -------------------------------------------------------------------------
  * (C) Copyright Gyyx Tec Corp. 1996-2017 - All Rights Reserved
  * @版权所有：北京光宇在线科技有限责任公司
  * @项目名称：fsh-action-service
  * @作者：fengshuhao
  * @联系方式：fengshuhao@gyyx.cn
  * @创建时间：2017年2月10日 下午5:52:57
  * @版本号：0.0.1
  *-------------------------------------------------------------------------
  */
package cn.gyyx.action.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.gyyx.action.beans.ResultBean;
import cn.gyyx.action.beans.WdPkRoleBindBean;
import cn.gyyx.action.bll.RoleInfoBindBll;

/**
 * <p>
 * XwbValentineDayServer描述
 * </p>
 * 
 * @author fengshuhao
 * @since 0.0.1
 */
public class BindInfoServer {
    /**
     * 日志记录
     */
    private static final Logger LOGGER = LoggerFactory
            .getLogger(BindInfoServer.class);
    private RoleInfoBindBll roleInfoBindBll =new RoleInfoBindBll();
    /**
     * <p>
     * 绑定用户信息业务
     * </p>
     *
     * @action fengshuhao 2017年2月10日 下午5:53:19 描述
     *
     * @param wdPkRoleBindBean
     * @return ResultBean<WdPkRoleBindBean>
     */
    public ResultBean<WdPkRoleBindBean> doBind(
            WdPkRoleBindBean wdPkRoleBindBean) {
        ResultBean<WdPkRoleBindBean> result = new ResultBean<WdPkRoleBindBean>(
                false, "未知错误", null);
        WdPkRoleBindBean bindInfo = roleInfoBindBll.getRoleBindInfoByAccount(
            wdPkRoleBindBean.getAccount(), wdPkRoleBindBean.getActionCode());
        LOGGER.info("炫舞吧2017情人节bindIndo：" + bindInfo);
        if (bindInfo == null) {
            // 以前没有绑定过 ，则插入
            roleInfoBindBll.inserBindInfoBean(wdPkRoleBindBean);
            result.setIsSuccess(true);
            result.setMessage("绑定成功");
            result.setData(wdPkRoleBindBean);
            return result;
        } else {
            // 以前绑定过，那么就修改绑定
            roleInfoBindBll.updateBind(wdPkRoleBindBean);
            result.setIsSuccess(true);
            result.setMessage("换绑成功");
            result.setData(wdPkRoleBindBean);
            return result;
        }
    }

}
