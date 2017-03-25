package tk.ainiyue.danyuan.application.datacentor.databaseinfo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import tk.ainiyue.danyuan.application.datacentor.databaseinfo.dao.SysDatabaseInfoDao;
import tk.ainiyue.danyuan.application.datacentor.databaseinfo.service.SysDatabaseInfoService;

/**
 * 文件名 ： SysDatabaseInfoServiceImpl.java
 * 包 名 ： tk.ainiyue.danyuan.application.datacentor.databaseinfo.service.impl
 * 描 述 ： TODO(用一句话描述该文件做什么)
 * 机能名称：
 * 技能ID ：
 * 作 者 ： wang
 * 时 间 ： 2017年3月20日 下午11:47:46
 * 版 本 ： V1.0
 */
public class SysDatabaseInfoServiceImpl implements SysDatabaseInfoService {
	//
	@Autowired
	private SysDatabaseInfoDao sysDatabaseInfoDao;

	/**  
	 *  方法名 ： getSysDatabaseInfoDao 
	 *  功    能 ： 返回变量 sysDatabaseInfoDao 的值  
	 *  @return: SysDatabaseInfoDao 
	 */  
	public SysDatabaseInfoDao getSysDatabaseInfoDao() {
		return sysDatabaseInfoDao;
	}

	/**  
	 *  方法名 ： setSysDatabaseInfoDao 
	 *  功    能 ： 设置变量 sysDatabaseInfoDao 的值
	 */  
	public void setSysDatabaseInfoDao(SysDatabaseInfoDao sysDatabaseInfoDao) {
		this.sysDatabaseInfoDao = sysDatabaseInfoDao;
	}
}
