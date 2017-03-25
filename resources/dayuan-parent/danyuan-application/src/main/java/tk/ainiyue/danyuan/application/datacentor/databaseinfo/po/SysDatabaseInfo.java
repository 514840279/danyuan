package tk.ainiyue.danyuan.application.datacentor.databaseinfo.po;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Length;

/**
 * 文件名 ： SysDatabaseInfo.java
 * 包 名 ： tk.ainiyue.danyuan.application.datacentor.databaseinfo
 * 描 述 ： TODO(用一句话描述该文件做什么)
 * 机能名称：
 * 技能ID ：
 * 作 者 ： wang
 * 时 间 ： 2017年3月20日 下午10:13:21
 * 版 本 ： V1.0
 */
@Entity
@Table(name = "sys_database_info")
public class SysDatabaseInfo {
	@Id
	@GenericGenerator(name = "idGenerator", strategy = "uuid")
	@GeneratedValue(generator = "idGenerator")
	@Column(name = "F_ModuleId", updatable = false)
	@NotNull
	@Length(max = 50)
	private String uuid;				 // 唯一主键
	private String type;				 // 数据库类型
	private String database_name;		 // 数据库名称
	private String database_information; // 数据库说明
	private String address;				 // 连接地址
	private String port;				 // 端口
	private String username;			 // 用户名
	private String password;			 // 密码
	private String driver;				 // 驱动类
	private String transform_control;	 // 控制器
	private String owner;				 // 拥有者
	
	@Temporal(TemporalType.TIMESTAMP)
	@org.hibernate.annotations.UpdateTimestamp
	@Column(name = "insert_datetime", nullable = false, updatable = false)
	private Date   insertDatetime;
	
	@Column(name = "updata_datetime")
	private Date   updataDatetime;
	
	@Column(name = "flag", length = 2)
	private String flag;
	
	/**
	 * 方法名 ： getUuid
	 * 功 能 ： 返回变量 uuid 的值
	 * 
	 * @return: String
	 */
	public String getUuid() {
		return uuid;
	}
	
	/**
	 * 方法名 ： setUuid
	 * 功 能 ： 设置变量 uuid 的值
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	/**
	 * 方法名 ： getType
	 * 功 能 ： 返回变量 type 的值
	 * 
	 * @return: String
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * 方法名 ： setType
	 * 功 能 ： 设置变量 type 的值
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * 方法名 ： getDatabase_name
	 * 功 能 ： 返回变量 database_name 的值
	 * 
	 * @return: String
	 */
	public String getDatabase_name() {
		return database_name;
	}
	
	/**
	 * 方法名 ： setDatabase_name
	 * 功 能 ： 设置变量 database_name 的值
	 */
	public void setDatabase_name(String database_name) {
		this.database_name = database_name;
	}
	
	/**
	 * 方法名 ： getDatabase_information
	 * 功 能 ： 返回变量 database_information 的值
	 * 
	 * @return: String
	 */
	public String getDatabase_information() {
		return database_information;
	}
	
	/**
	 * 方法名 ： setDatabase_information
	 * 功 能 ： 设置变量 database_information 的值
	 */
	public void setDatabase_information(String database_information) {
		this.database_information = database_information;
	}
	
	/**
	 * 方法名 ： getAddress
	 * 功 能 ： 返回变量 address 的值
	 * 
	 * @return: String
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * 方法名 ： setAddress
	 * 功 能 ： 设置变量 address 的值
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * 方法名 ： getPort
	 * 功 能 ： 返回变量 port 的值
	 * 
	 * @return: String
	 */
	public String getPort() {
		return port;
	}
	
	/**
	 * 方法名 ： setPort
	 * 功 能 ： 设置变量 port 的值
	 */
	public void setPort(String port) {
		this.port = port;
	}
	
	/**
	 * 方法名 ： getUsername
	 * 功 能 ： 返回变量 username 的值
	 * 
	 * @return: String
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * 方法名 ： setUsername
	 * 功 能 ： 设置变量 username 的值
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * 方法名 ： getPassword
	 * 功 能 ： 返回变量 password 的值
	 * 
	 * @return: String
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * 方法名 ： setPassword
	 * 功 能 ： 设置变量 password 的值
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * 方法名 ： getDriver
	 * 功 能 ： 返回变量 driver 的值
	 * 
	 * @return: String
	 */
	public String getDriver() {
		return driver;
	}
	
	/**
	 * 方法名 ： setDriver
	 * 功 能 ： 设置变量 driver 的值
	 */
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	/**
	 * 方法名 ： getTransform_control
	 * 功 能 ： 返回变量 transform_control 的值
	 * 
	 * @return: String
	 */
	public String getTransform_control() {
		return transform_control;
	}
	
	/**
	 * 方法名 ： setTransform_control
	 * 功 能 ： 设置变量 transform_control 的值
	 */
	public void setTransform_control(String transform_control) {
		this.transform_control = transform_control;
	}
	
	/**
	 * 方法名 ： getOwner
	 * 功 能 ： 返回变量 owner 的值
	 * 
	 * @return: String
	 */
	public String getOwner() {
		return owner;
	}
	
	/**
	 * 方法名 ： setOwner
	 * 功 能 ： 设置变量 owner 的值
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	/**
	 * 方法名 ： toString
	 * 功 能 ： TODO(这里用一句话描述这个方法的作用)
	 * 参 数 ： @return
	 * 参 考 ： @see java.lang.Object#toString()
	 * 作 者 ： wang
	 */
	
	@Override
	public String toString() {
		return "SysDatabaseInfo [uuid=" + uuid + ", type=" + type + ", database_name=" + database_name + ", database_information=" + database_information + ", address=" + address + ", port=" + port + ", username=" + username + ", password=" + password + ", driver=" + driver + ", transform_control=" + transform_control + ", owner=" + owner + "]";
	}

	/**  
	 *  方法名 ： getInsertDatetime 
	 *  功    能 ： 返回变量 insertDatetime 的值  
	 *  @return: Date 
	 */
	public Date getInsertDatetime() {
		return insertDatetime;
	}

	/**  
	 *  方法名 ： setInsertDatetime 
	 *  功    能 ： 设置变量 insertDatetime 的值
	 */
	public void setInsertDatetime(Date insertDatetime) {
		this.insertDatetime = insertDatetime;
	}

	/**  
	 *  方法名 ： getUpdataDatetime 
	 *  功    能 ： 返回变量 updataDatetime 的值  
	 *  @return: Date 
	 */
	public Date getUpdataDatetime() {
		return updataDatetime;
	}

	/**  
	 *  方法名 ： setUpdataDatetime 
	 *  功    能 ： 设置变量 updataDatetime 的值
	 */
	public void setUpdataDatetime(Date updataDatetime) {
		this.updataDatetime = updataDatetime;
	}

	/**  
	 *  方法名 ： getFlag 
	 *  功    能 ： 返回变量 flag 的值  
	 *  @return: String 
	 */
	public String getFlag() {
		return flag;
	}

	/**  
	 *  方法名 ： setFlag 
	 *  功    能 ： 设置变量 flag 的值
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
}
