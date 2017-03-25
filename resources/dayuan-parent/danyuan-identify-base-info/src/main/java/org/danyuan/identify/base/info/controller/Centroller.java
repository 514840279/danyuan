package org.danyuan.identify.base.info.controller;

import java.util.List;

import org.danyuan.identify.base.info.po.SysVirtualPersionBaseInfo;
import org.danyuan.utils.dao.impl.HibernateDaoImpl;

/**
 * 文件名 ： Centroller.java
 * 包 名 ： tk.ainiyue.danyuan.controller
 * 描 述 ： TODO(用一句话描述该文件做什么)
 * 机能名称：
 * 技能ID ：
 * 作 者 ： Administrator
 * 时 间 ： 2016年7月6日 上午10:58:16
 * 版 本 ： V1.0
 */
public class Centroller extends HibernateDaoImpl<SysVirtualPersionBaseInfo> {
	
	/**
	 * 方法名： run
	 * 功 能： 运行
	 * 参 数：
	 * 返 回： void
	 * 作 者 ： Administrator
	 * @throws
	 */
	public static void run() {
		SysVirtualPersionBaseInfo base = new SysVirtualPersionBaseInfo();
		// 读取配置表 取得记录
		
		// 判断取得的表的执行状态
		// 未执行的进行合并qq好到临时表 状态更新1 执行中查询一个qq
		// 执行中查询一个qq
		// 查询补齐数据
		// 更新记录
		// 删除临时表qq
		// 垃圾回收
		System.gc();
	}
	
	/**
	 * 方法名： findTypefromDB
	 * 功 能： TODO(这里用一句话描述这个方法的作用)
	 * 参 数： @param strlist
	 * 参 数： @return
	 * 返 回： List<SysFilesInfo>
	 * 作 者 ： Administrator
	 * @throws
	 */
	public List<Object> findTypefromDB(List<String> strlist) {
		Centroller cc = new Centroller();
		// // hql 语句
		// String hql = "From SysFilesInfo where (flag = '0' or flag is null) and lower(type) in ('";
		// // 只要取配置的文件类型
		// for (String string : strlist) {
		// hql += string + "','";
		// }
		// // 取前10条信息
		// hql += "') and rownum< 50";
		// // 以文件大小排序
		// hql += " order by byttery ";
		// 返回 文件信息
		// return cc.getObject(hql, Constant._HIBERNATE_ORCL, null);
		return null;
		
	}
	
}
