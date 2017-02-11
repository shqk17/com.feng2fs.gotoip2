/**
  * -------------------------------------------------------------------------
  * (C) Copyright Gyyx Tec Corp. 1996-2017 - All Rights Reserved
  * @版权所有：北京光宇在线科技有限责任公司
  * @项目名称：fsh-action-dao
  * @作者：fengshuhao
  * @联系方式：fengshuhao@gyyx.cn
  * @创建时间：2017年2月11日 下午5:25:17
  * @版本号：0.0.1
  *-------------------------------------------------------------------------
  */
package cn.gyyx.action.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cn.gyyx.action.beans.WdPkRoleBindBean;
import cn.gyyx.action.dao.wdpkforecast.IWdPkForeCastMapper;

/**
 * <p>
 * BindInfoDao描述
 * </p>
 * 
 * @author fengshuhao
 * @since 0.0.1
 */
public class BindInfoDao {
    SqlSessionFactory factory = MyBatisConnectionFactory
            .getSqlActionDBV2SessionFactory();

    /**
     * <p>
     * 通过用户名查询用户绑定信息
     * </p>
     *
     * @action fengshuhao 2017年2月11日 下午5:27:09 描述
     *
     * @param account
     * @param actionCode
     * @return WdPkRoleBindBean
     */
    public WdPkRoleBindBean selectRoleBindInfoByAccount(String account,
            int actionCode) {
        try (SqlSession session = factory.openSession()) {
            BindInfoMapper mapper = session.getMapper(BindInfoMapper.class);
            return mapper.selectRoleBindInfoByAccount(account, actionCode);
        }
    }

    /**
     * <p>
     * 插入用户绑定信息
     * </p>
     *
     * @action fengshuhao 2017年2月11日 下午5:28:24 描述
     *
     * @param wdPkRoleBindBean
     *            void
     */
    public void insertBindInfoBean(WdPkRoleBindBean wdPkRoleBindBean) {
        try (SqlSession session = factory.openSession()) {
            BindInfoMapper mapper = session.getMapper(BindInfoMapper.class);
            mapper.insertWdPkRoleBindBean(wdPkRoleBindBean);
            session.commit();
        }
    }

    /**
     * <p>
     * 更新用户绑定信息
     * </p>
     *
     * @action fengshuhao 2017年2月11日 下午5:29:23 描述
     *
     * @param wdPkRoleBindBean
     *            void
     */
    public void updateBind(WdPkRoleBindBean wdPkRoleBindBean) {
        try (SqlSession session = factory.openSession()) {
            BindInfoMapper mapper = session
                    .getMapper(BindInfoMapper.class);
            mapper.updateBind(wdPkRoleBindBean);
            session.commit();
        }
    }

}
