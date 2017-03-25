package tk.ainiyue.danyuan.application.authority.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件名 ： AuthorityVO.java
 * 包 名 ： tk.ainiyue.danyuan.application.authority.vo
 * 描 述 ： TODO(用一句话描述该文件做什么)
 * 机能名称：
 * 技能ID ：
 * 作 者 ： wang
 * 时 间 ： 2016年10月26日 下午9:47:35
 * 版 本 ： V1.0
 */
public class AuthorityVO {
	
	private String			  id;
	
	private String			  name;
	
	private List<AuthorityVO> list = new ArrayList<AuthorityVO>();
	
	/**
	 * 方法名 ： getId
	 * 功 能 ： 返回变量 id 的值
	 * 
	 * @return: String
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * 方法名 ： setId
	 * 功 能 ： 设置变量 id 的值
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * 方法名 ： getName
	 * 功 能 ： 返回变量 name 的值
	 * 
	 * @return: String
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 方法名 ： setName
	 * 功 能 ： 设置变量 name 的值
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 方法名 ： getList
	 * 功 能 ： 返回变量 list 的值
	 * 
	 * @return: List<AuthorityVO>
	 */
	public List<AuthorityVO> getList() {
		return list;
	}
	
	/**
	 * 方法名 ： setList
	 * 功 能 ： 设置变量 list 的值
	 */
	public void setList(List<AuthorityVO> list) {
		this.list = list;
	}
	
}
