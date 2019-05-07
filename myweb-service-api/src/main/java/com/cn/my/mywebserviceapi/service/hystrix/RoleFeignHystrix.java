package com.cn.my.mywebserviceapi.service.hystrix;

import com.cn.my.mywebcommon.entity.ReturnObject;
import com.cn.my.mywebserviceapi.entity.RoleDO;
import com.cn.my.mywebserviceapi.service.RoleFeignApi;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 角色
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-23 20:51:17
 */
@Component
public class RoleFeignHystrix implements RoleFeignApi {
    /***
    * 根据主键查询Role
    * @param role
	* @return
	*/
    @Override
	public ReturnObject getRole(RoleDO role){
	    return null;
    }

    /***
     * 根据实体参数查询Role
     * @param role
     * @return
     */
    @Override
    public ReturnObject getRoleList(RoleDO role){
        return null;
    }

    /***
     * 根据条件查询总数
     * @param role
     * @return
     */
    @Override
    public ReturnObject countRole(RoleDO role){
        return null;
    }

    /***
     * 插入Role
     * @param role
     * @return
     */
    @Override
    public ReturnObject saveRole(RoleDO role){
        return null;
    }

    /***
     * 修改Role
     * @param role
     * @return
     */
    @Override
    public ReturnObject updateRole(RoleDO role){
	    return null;
    }

    /***
     * 删除Role
     * @param roleId
     * @return
     */
    @Override
    public ReturnObject removeRole(Long roleId){
        return null;
    }

    /***
     * 批量插入Role
     * @param roleList
     * @return
     */
    @Override
    public ReturnObject batchSaveRole(List<RoleDO> roleList){
        return null;
    }

    /***
     * 批量修改Role
     * @param roleList
     * @return
     */
    @Override
    public ReturnObject batchUpdateRole(List<RoleDO> roleList){
        return null;
    }

    /***
     * 批量删除Role
     * @param roleIds
     * @return
     */
    @Override
    public ReturnObject batchRemoveRole(Long[] roleIds){
        return null;
    }
}
