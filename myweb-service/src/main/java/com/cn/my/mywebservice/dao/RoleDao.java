package com.cn.my.mywebservice.dao;


import java.util.List;
import java.util.Map;

import com.cn.my.mywebserviceapi.entity.RoleDO;
import tk.mybatis.mapper.common.Mapper;

/**
 * 角色
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-23 20:51:17
 */
@org.apache.ibatis.annotations.Mapper
public interface RoleDao extends Mapper<RoleDO>{

    List<RoleDO> getRoleList(Map<String, Object> map);
    /***
    * 批量插入Role
    * @param roleList
    * @return
    */
    int batchSaveRole(List<RoleDO> roleList);

    /***
     * 批量修改Role
     * @param roleList
     * @return
     */
    int batchUpdateRole(List<RoleDO> roleList);

    /***
     * 批量删除Role
     * @param roleIds
     * @return
     */
	int batchRemoveRole(Long[] roleIds);
}
