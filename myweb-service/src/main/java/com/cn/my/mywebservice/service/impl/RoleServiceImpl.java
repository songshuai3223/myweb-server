package com.cn.my.mywebservice.service.impl;

import com.cn.my.mywebservice.dao.RoleDao;
import com.cn.my.mywebservice.service.RoleService;
import com.cn.my.mywebserviceapi.entity.RoleDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



@Service("roleService")
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleDao roleDao;
	
	@Override
	public RoleDO getRole(RoleDO role){
		return roleDao.selectByPrimaryKey(role);
	}
	
	@Override
	public List<RoleDO> getRolelist(RoleDO role){
		return roleDao.select(role);
	}
	
	@Override
	public int countRole(RoleDO role){
		return roleDao.selectCount(role);
	}
	
	@Override
	public int saveRole(RoleDO role){
		return roleDao.insertSelective(role);
	}
	
	@Override
	public int updateRole(RoleDO role){
		return roleDao.updateByPrimaryKeySelective(role);
	}
	
	@Override
	public int removeRole(Long roleId){
		return roleDao.deleteByPrimaryKey(roleId);
	}

    @Override
    public int batchSaveRole(List<RoleDO> roleList) {
        return roleDao.batchSaveRole(roleList);
    }

    @Override
    public int batchUpdateRole(List<RoleDO> roleList) {
        return roleDao.batchUpdateRole(roleList);
    }
	
	@Override
	public int batchRemoveRole(Long[] roleIds){
		return roleDao.batchRemoveRole(roleIds);
	}
	
}
