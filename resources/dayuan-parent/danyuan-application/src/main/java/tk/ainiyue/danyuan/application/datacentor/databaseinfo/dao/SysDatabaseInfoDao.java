package tk.ainiyue.danyuan.application.datacentor.databaseinfo.dao;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * 文件名 ： SysDatabaseInfo.java
 * 包 名 ： tk.ainiyue.danyuan.application.datacentor.databaseinfo.dao
 * 描 述 ： TODO(用一句话描述该文件做什么)
 * 机能名称：
 * 技能ID ：
 * 作 者 ： wang
 * 时 间 ： 2017年3月20日 下午11:44:45
 * 版 本 ： V1.0
 */
@Repository("sysDatabaseInfoDao")
@DynamicUpdate(true)
@DynamicInsert(true)
public interface SysDatabaseInfoDao extends PagingAndSortingRepository<SysDatabaseInfoDao, String> {
	
}
