package com.cn.my.mywebservice.service;


import com.cn.my.mywebserviceapi.entity.RoleDO;

import java.util.List;
import java.util.Map;

/**
 * 角色
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-23 20:51:17
 */
public interface RoleService {
    /***
    * 根据主键查询Role
    * @param role
	* @return
	*/
	RoleDO getRole(RoleDO role);

    /***
     * 根据实体参数查询Role
     * @param role
     * @return
     */
	List<RoleDO> getRolelist(RoleDO role);

    /***
     * 根据条件查询总数
     * @param role
     * @return
     */
	int countRole(RoleDO role);

    /***
     * 插入Role
     * @param role
     * @return
     */
	int saveRole(RoleDO role);

    /***
     * 修改Role
     * @param user
     * @return
     */
	int updateRole(RoleDO role);

    /***
     * 删除Role
     * @param roleId
     * @return
     */
	int removeRole(Long roleId);

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
