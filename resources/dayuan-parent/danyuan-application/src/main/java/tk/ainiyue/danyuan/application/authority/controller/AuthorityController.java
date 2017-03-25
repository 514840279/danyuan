package tk.ainiyue.danyuan.application.authority.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.ainiyue.danyuan.application.authority.po.Authority;
import tk.ainiyue.danyuan.application.authority.service.AuthorityService;
import tk.ainiyue.danyuan.application.authority.vo.AuthorityVO;
import tk.ainiyue.danyuan.application.authority.vo.AuthorityzTreeVO;

/**
 * 文件名 ： SysDepartment.java
 * 包 名 ： tk.ainiyue.admin.department.controller
 * 描 述 ： 权限控制器
 * 机能名称：
 * 技能ID ：
 * 作 者 ： Tenghui.Wang
 * 时 间 ： 2016年7月17日 下午3:45:28
 * 版 本 ： V1.0
 */
@RestController
@RequestMapping("/authority")
public class AuthorityController {
	//
	private static final Logger	logger = LoggerFactory.getLogger(AuthorityController.class);
	
	//
	@Autowired
	private AuthorityService	authorityService;
	
	/**
	 * 方法名： findAll
	 * 功 能： TODO(这里用一句话描述这个方法的作用)
	 * 参 数： @return
	 * 返 回： List<SysDepartmentInfo>
	 * 作 者 ： Tenghui.Wang
	 * @throws
	 */
	@RequestMapping("/authorityList")
	public List<Map<String, Object>> findAll() {
		logger.info("sysSystemList", AuthorityController.class);
		List<Authority> list = authorityService.findAll();
		Map<String, Object> map = null;
		List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
		for (Authority authority : list) {
			map = new HashMap<String, Object>();
			
//		    "F_ModuleId": "1",
			map.put("F_ModuleId", authority.getfModuleId());
//		    "F_ParentId": "0",
			map.put("F_ParentId", authority.getfParentId());
//		    "F_EnCode": "SysManage",
			map.put("F_EnCode", authority.getfEnCode());
//		    "F_FullName": "系统管理",
			map.put("F_FullName", authority.getfFullName());
//		    "F_Icon": "fa fa-desktop",
			map.put("F_Icon", authority.getfIcon());
			
//		    "F_UrlAddress": null,
			map.put("F_UrlAddress", authority.getfUrlAddress());
//		    "F_Target": "expand",
			map.put("F_Target", authority.getfTarget());
//		    "F_IsMenu": 0,
			map.put("F_IsMenu", authority.getfIsMenu());
//		    "F_AllowExpand": 1,
			map.put("F_AllowExpand", authority.getfAllowExpand());
//		    "F_IsPublic": 0,
			map.put("F_IsPublic", authority.getfIsPublic());
//		    "F_AllowEdit": null,
			map.put("F_AllowEdit", authority.getfAllowEdit());
//		    "F_AllowDelete": null,
			map.put("F_AllowDelete", authority.getfAllowDelete());
//		    "F_SortCode": 1,
			map.put("F_SortCode", authority.getfSortCode());
//		    "F_DeleteMark": 0,
			map.put("F_DeleteMark", authority.getfDeleteMark());
//		    "F_EnabledMark": 1,
			map.put("F_EnabledMark", authority.getfEnabledMark());
//		    "F_Description": null,
			map.put("F_Description", authority.getfDescription());
//		    "F_CreateDate": null,
			map.put("F_CreateDate", authority.getfCreateDate());
//		    "F_CreateUserId": null,
			map.put("F_CreateUserId", authority.getfCreateUserId());
//		    "F_CreateUserName": null,
			map.put("F_CreateUserName", authority.getfCreateUserName());
//		    "F_ModifyDate": "2015-11-17 11:22:46",
			map.put("F_ModifyDate", authority.getfModifyDate());
//		    "F_ModifyUserId": "System",
			map.put("F_ModifyUserId", authority.getfModifyUserId());
//		    "F_ModifyUserName": "超级管理员"
			map.put("F_ModifyUserName", authority.getfModifyUserName());
			
			result.add(map);
		}
		return result;
	}
	
	/**
	 * 方法名： addbatch
	 * 功 能： 批量添加
	 * 参 数： @param authorityList
	 * 参 数： @return
	 * 返 回： String
	 * 作 者 ： Tenghui.Wang
	 * @throws
	 */
	@RequestMapping("/addbatch")
	public void addbatch(@RequestBody List<Authority> authorityList) {
		for (Authority authority : authorityList) {
			authorityService.save(authority);
		}
	}
	
	/**
	 * 方法名： findTree
	 * 功 能： 取得tree信息
	 * 参 数： @return
	 * 返 回： List<AuthorityVO>
	 * 作 者 ： wang
	 * @throws
	 */
	@RequestMapping("/findTree")
	public List<AuthorityVO> findTree() {
		return authorityService.findAllByF_ParentId("0");
	}
	
	/**
	 * 方法名： findzTree
	 * 功 能： 取得ztree信息
	 * 参 数： @return
	 * 返 回： List<AuthorityVO>
	 * 作 者 ： wang
	 * @throws
	 */
	@RequestMapping("/findzTree")
	public List<AuthorityzTreeVO> findzTree() {
		return authorityService.findzTreeByF_ParentId("0");
	}
	
	/**
	 * 方法名： findzTree
	 * 功 能： 增加节点
	 * 参 数： @return
	 * 返 回： List<AuthorityVO>
	 * 作 者 ： wang
	 * @throws
	 */
	@RequestMapping("/addAuthority")
	public AuthorityzTreeVO addzTree(@RequestBody Authority authority) {
		return authorityService.save(authority);
	}
	
	/**
	 * 方法名： findzTree
	 * 功 能： 增加节点
	 * 参 数： @return
	 * 返 回： List<AuthorityVO>
	 * 作 者 ： wang
	 * @throws
	 */
	@RequestMapping("/findAuthorityByUuid")
	public Authority findAuthorityByUuid(@RequestBody Authority authority) {
		return authorityService.findAuthorityByUuid(authority);
	}
	
	/**
	 * 方法名： deleteAuthority
	 * 功 能： 删除
	 * 参 数： @param authority
	 * 返 回： void
	 * 作 者 ： wang
	 * @throws
	 */
	@RequestMapping("/deleteAuthority")
	public Map<String, String> deleteAuthority(@RequestBody Authority authority) {
		authorityService.deleteAuthority(authority);
		Map<String, String> map = new HashMap<String, String>();
		map.put("code", "0");
		return map;
	}
	
	/**
	 * 方法名： updateAuthorityName
	 * 功 能： 更新名称
	 * 参 数： @param authority
	 * 参 数： @return
	 * 返 回： AuthorityzTreeVO
	 * 作 者 ： wang
	 * @throws
	 */
	@RequestMapping("/updateAuthorityName")
	public AuthorityzTreeVO updateAuthorityName(@RequestBody Authority authority) {
		return authorityService.updateAuthorityName(authority);
	}
	
	/**
	 * 方法名： onDropAuthority
	 * 功 能： 拖拽排序
	 * 参 数： @param authorityzTreeVO
	 * 参 数： @return
	 * 返 回： AuthorityzTreeVO
	 * 作 者 ： wang
	 * @throws
	 */
	@RequestMapping("/onDropAuthority")
	public AuthorityzTreeVO onDropAuthority(@RequestBody Authority authority) {
		return authorityService.onDropAuthority(authority);
	}
	
}
