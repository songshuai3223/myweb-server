package com.cn.my.mywebservice.rpc;

import com.cn.my.mywebcommon.entity.ReturnObject;
import com.cn.my.mywebservice.service.RoleService;
import com.cn.my.mywebserviceapi.entity.RoleDO;
import com.cn.my.mywebserviceapi.service.RoleFeignApi;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The class Mdc product query feign client.
 *
 * @author paascloud.net @gmail.com
 */
@RefreshScope
@RestController
@Api(value = "API - MdcAddressQueryFeignClient", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class RoleFeignClient implements RoleFeignApi {

	@Autowired
	private RoleService roleService;

	/***
	 * 根据主键查询Role
	 * @param role
	 * @return
	 */
	@Override
	public ReturnObject getRole(RoleDO role){
		ReturnObject returnObject=new ReturnObject();
		returnObject.setResult(roleService.getRole(role));
		return returnObject;
	}

	/***
	 * 生成Role查询列表
	 * @param role
	 * @return
	 */
	@Override
	public ReturnObject getRoleList(@RequestParam RoleDO role) {
		ReturnObject returnObject=new ReturnObject();
		returnObject.setResult(roleService.getRole(role));
		return returnObject;
	}

	/***
	 * 根据条件查询总数
	 * @param role
	 * @return
	 */
	@Override
	public ReturnObject countRole(RoleDO role){
		ReturnObject returnObject=new ReturnObject();
		returnObject.setResult(roleService.countRole(role));
		return returnObject;
	}

	/***
	 * 插入Role
	 * @param role
	 * @return
	 */
	@Override
	public ReturnObject saveRole(RoleDO role){
		ReturnObject returnObject=new ReturnObject();
		roleService.saveRole(role);
		return returnObject;
	}

	/***
	 * 修改Role
	 * @param role
	 * @return
	 */
	@Override
	public ReturnObject updateRole(RoleDO role){
		ReturnObject returnObject=new ReturnObject();
		roleService.updateRole(role);
		return returnObject;
	}

	/***
	 * 删除Role
	 * @param roleId
	 * @return
	 */
	@Override
	public ReturnObject removeRole(Long roleId){
		ReturnObject returnObject=new ReturnObject();
		roleService.removeRole(roleId);
		return returnObject;
	}

	/***
	 * 批量插入Role
	 * @param roleList
	 * @return
	 */
	@Override
	public ReturnObject batchSaveRole(List<RoleDO> roleList){
		ReturnObject returnObject=new ReturnObject();
		roleService.batchSaveRole(roleList);
		return returnObject;
	}

	/***
	 * 批量修改Role
	 * @param roleList
	 * @return
	 */
	@Override
	public ReturnObject batchUpdateRole(List<RoleDO> roleList){
		ReturnObject returnObject=new ReturnObject();
		roleService.batchUpdateRole(roleList);
		return returnObject;
	}

	/***
	 * 批量删除Role
	 * @param roleIds
	 * @return
	 */
	@Override
	public ReturnObject batchRemoveRole(Long[] roleIds){
		ReturnObject returnObject=new ReturnObject();
		roleService.batchRemoveRole(roleIds);
		return returnObject;
	}
}
