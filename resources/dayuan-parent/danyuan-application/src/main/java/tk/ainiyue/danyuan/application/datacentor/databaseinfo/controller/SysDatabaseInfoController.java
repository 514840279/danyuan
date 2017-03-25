package tk.ainiyue.danyuan.application.datacentor.databaseinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.ainiyue.danyuan.application.datacentor.databaseinfo.service.SysDatabaseInfoService;

/**
 * 文件名 ： SysDatabaseInfoController.java
 * 包 名 ： tk.ainiyue.danyuan.application.datacentor.databaseinfo.controller
 * 描 述 ： TODO(用一句话描述该文件做什么)
 * 机能名称：
 * 技能ID ：
 * 作 者 ： wang
 * 时 间 ： 2017年3月20日 下午11:48:07
 * 版 本 ： V1.0
 */
@RestController
@RequestMapping("/authority")
public class SysDatabaseInfoController {
	//
	@Autowired
	private SysDatabaseInfoService sysDatabaseInfoService;

	/**  
	 *  方法名 ： getSysDatabaseInfoService 
	 *  功    能 ： 返回变量 sysDatabaseInfoService 的值  
	 *  @return: SysDatabaseInfoService 
	 */  
	public SysDatabaseInfoService getSysDatabaseInfoService() {
		return sysDatabaseInfoService;
	}

	/**  
	 *  方法名 ： setSysDatabaseInfoService 
	 *  功    能 ： 设置变量 sysDatabaseInfoService 的值
	 */  
	public void setSysDatabaseInfoService(SysDatabaseInfoService sysDatabaseInfoService) {
		this.sysDatabaseInfoService = sysDatabaseInfoService;
	}
}
