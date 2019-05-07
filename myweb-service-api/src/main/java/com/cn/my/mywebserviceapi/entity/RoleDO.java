package com.cn.my.mywebserviceapi.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * 角色
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-23 20:51:17
 */
@Data

@Table(name = "sys_role")
@ApiModel
public class RoleDO implements Serializable {
	private static final long serialVersionUID = 1L;


    //
	@ApiModelProperty(value = "")
	@Column(name = "role_id")
	private Long roleId;

    //角色名称
	@ApiModelProperty(value = "角色名称")
	@Column(name = "role_name")
	private String roleName;

    //角色标识
	@ApiModelProperty(value = "角色标识")
	@Column(name = "role_sign")
	private String roleSign;

    //备注
	@ApiModelProperty(value = "备注")
	@Column(name = "remark")
	private String remark;

    //创建用户id
	@ApiModelProperty(value = "创建用户id")
	@Column(name = "user_id_create")
	private Long userIdCreate;

    //创建时间
	@ApiModelProperty(value = "创建时间")
	@Column(name = "gmt_create")
	private Date gmtCreate;

    //创建时间
	@ApiModelProperty(value = "创建时间")
	@Column(name = "gmt_modified")
	private Date gmtModified;

}
