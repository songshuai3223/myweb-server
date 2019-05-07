package com.cn.my.mywebserviceapi.service;

import com.cn.my.mywebcommon.entity.ReturnObject;
import com.cn.my.mywebserviceapi.entity.RoleDO;
import com.cn.my.mywebserviceapi.service.hystrix.RoleFeignHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 角色
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-23 20:51:17
 */
@FeignClient(value = "myweb-provider-role",fallback = RoleFeignHystrix.class)
public interface RoleFeignApi {
    /***
    * 根据主键查询Role
    * @param role
	* @return
	*/
    @PostMapping(value = "/api/role/getById")
    ReturnObject getRole(RoleDO role);

    /***
     * 根据实体参数查询Role
     * @param role
     * @return
     */
    @PostMapping(value = "/api/role/list")
    @ResponseBody
    ReturnObject getRoleList(RoleDO role);

    /***
     * 根据条件查询总数
     * @param role
     * @return
     */
    @PostMapping(value = "/api/role/count")
    ReturnObject countRole(RoleDO role);

    /***
     * 插入Role
     * @param role
     * @return
     */
    @PostMapping(value = "/api/role/save")
    ReturnObject saveRole(RoleDO role);

    /***
     * 修改Role
     * @param role
     * @return
     */
    @PostMapping(value = "/api/role/update")
    ReturnObject updateRole(RoleDO role);

    /***
     * 删除Role
     * @param roleId
     * @return
     */
    @PostMapping(value = "/api/role/delete")
    ReturnObject removeRole(Long roleId);

    /***
     * 批量插入Role
     * @param roleList
     * @return
     */
    @PostMapping(value = "/api/role/batchsave")
    ReturnObject batchSaveRole(List<RoleDO> roleList);

    /***
     * 批量修改Role
     * @param roleList
     * @return
     */
    @PostMapping(value = "/api/role/batchupdate")
    ReturnObject batchUpdateRole(List<RoleDO> roleList);

    /***
     * 批量删除Role
     * @param roleIds
     * @return
     */
    @PostMapping(value = "/api/role/batchdelete")
    ReturnObject batchRemoveRole(Long[] roleIds);
}
