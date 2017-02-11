/**
  * -------------------------------------------------------------------------
  * (C) Copyright Gyyx Tec Corp. 1996-2017 - All Rights Reserved
  * @版权所有：北京光宇在线科技有限责任公司
  * @项目名称：fsh-action-bll
  * @作者：fengshuhao
  * @联系方式：fengshuhao@gyyx.cn
  * @创建时间：2017年2月10日 下午5:58:21
  * @版本号：0.0.1
  *-------------------------------------------------------------------------
  */
package cn.gyyx.action.bll;

import cn.gyyx.action.beans.WdPkRoleBindBean;
import cn.gyyx.action.dao.BindInfoDao;


/**
  * <p>
  *   WdRoleBind描述
  * </p>
  *  
  * @author fengshuhao
  * @since 0.0.1
  */
public class RoleInfoBindBll {
    private BindInfoDao bindInfoDao = new BindInfoDao();
    /**
      * <p>
      *    通过用户账号查询用户信息
      * </p>
      *
      * @action
      *    fengshuhao 2017年2月10日 下午5:58:48 描述
      *
      * @param account
      * @param actionCode
      * @return WdPkRoleBindBean
      */
    public WdPkRoleBindBean getRoleBindInfoByAccount(String account,
            int actionCode) {
        return bindInfoDao.selectRoleBindInfoByAccount(account,actionCode);
    }

    /**
      * <p>
      *    插入用户信息
      * </p>
      *
      * @action
      *    fengshuhao 2017年2月10日 下午6:01:03 描述
      *
      * @param wdPkRoleBindBean void
      */
    public void insertBindInfoBean(WdPkRoleBindBean wdPkRoleBindBean) {
        bindInfoDao.insertBindInfoBean(wdPkRoleBindBean);
        
    }

    /**
      * <p>
      *    更新用户信息
      * </p>
      *
      * @action
      *    fengshuhao 2017年2月10日 下午6:01:18 描述
      *
      * @param wdPkRoleBindBean void
      */
    public void updateBind(WdPkRoleBindBean wdPkRoleBindBean) {
        bindInfoDao.updateBind(wdPkRoleBindBean);
        
    }

}
