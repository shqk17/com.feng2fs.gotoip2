/**
  * -------------------------------------------------------------------------
  * (C) Copyright Gyyx Tec Corp. 1996-2017 - All Rights Reserved
  * @版权所有：北京光宇在线科技有限责任公司
  * @项目名称：fsh-action-dao
  * @作者：fengshuhao
  * @联系方式：fengshuhao@gyyx.cn
  * @创建时间：2017年2月11日 下午5:37:10
  * @版本号：0.0.1
  *-------------------------------------------------------------------------
  */
package cn.gyyx.action.dao;

import cn.gyyx.action.beans.WdPkRoleBindBean;

/**
  * <p>
  *   BindInfoMapper描述
  * </p>
  *  
  * @author fengshuhao
  * @since 0.0.1
  */
public interface BindInfoMapper {

    /**
      * <p>
      *   通过用户名查询用户绑定信息
      * </p>
      *
      * @action
      *    fengshuhao 2017年2月11日 下午5:37:17 描述
      *
      * @param account
      * @param actionCode
      * @return WdPkRoleBindBean
      */
    WdPkRoleBindBean selectRoleBindInfoByAccount(String account,
            int actionCode);

    /**
      * <p>
      *     插入用户绑定信息
      * </p>
      *
      * @action
      *    fengshuhao 2017年2月11日 下午5:37:28 描述
      *
      * @param wdPkRoleBindBean void
      */
    void insertWdPkRoleBindBean(WdPkRoleBindBean wdPkRoleBindBean);

    /**
      * <p>
      *    更新用户绑定信息
      * </p>
      *
      * @action
      *    fengshuhao 2017年2月11日 下午5:37:32 描述
      *
      * @param wdPkRoleBindBean void
      */
    void updateBind(WdPkRoleBindBean wdPkRoleBindBean);

}
