package tk.ainiyue.danyuan.application.authority.po;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "sys_authority_info")
public class Authority {
	@Id
//	@GenericGenerator(name = "idGenerator", strategy = "uuid")
//	@GeneratedValue(generator = "idGenerator")
	@Column(name = "F_ModuleId", updatable = false)
	@NotNull
	@Length(max = 50)
	private String	fModuleId;
	@Column(name = "F_ParentId")
	@Length(max = 50)
	private String	fParentId;
	@Column(name = "F_EnCode")
	@Length(max = 50)
	private String	fEnCode;
	@Column(name = "F_FullName")
	@Length(max = 40)
	private String	fFullName;
	@Column(name = "F_Icon")
	@Length(max = 40)
	private String	fIcon;
	@Column(name = "F_UrlAddress")
	@Length(max = 2000)
	private String	fUrlAddress;
	@Column(name = "F_Target")
	@Length(max = 20)
	private String	fTarget;
	@Column(name = "F_IsMenu")
	private Integer	fIsMenu;
	@Column(name = "F_AllowExpand")
	private Integer	fAllowExpand;
	@Column(name = "F_IsPublic")
	private Integer	fIsPublic;
	@Column(name = "F_AllowEdit")
	private Integer	fAllowEdit;
	@Column(name = "F_AllowDelete")
	private Integer	fAllowDelete;
	@Column(name = "F_SortCode")
	private Integer	fSortCode;
	@Column(name = "F_DeleteMark")
	private Integer	fDeleteMark;
	@Column(name = "F_EnabledMark")
	private Integer	fEnabledMark;
	@Column(name = "F_Description")
	@Length(max = 200)
	private String	fDescription;
	@Column(name = "F_CreateDate", updatable = false)
	private Date	fCreateDate;
	@Column(name = "F_CreateUserId")
	@Length(max = 50)
	private String	fCreateUserId;
	@Column(name = "F_CreateUserName")
	@Length(max = 50)
	private String	fCreateUserName;
	@Column(name = "F_ModifyDate")
	private Date	fModifyDate;
	@Column(name = "F_ModifyUserId")
	@Length(max = 50)
	private String	fModifyUserId;
	@Column(name = "F_ModifyUserName")
	@Length(max = 100)
	private String	fModifyUserName;
	@Transient
	private String	moveType;
	
	/**
	 * 方法名 ： getfModuleId
	 * 功 能 ： 返回变量 fModuleId 的值
	 * 
	 * @return: String
	 */
	public String getfModuleId() {
		return fModuleId;
	}
	
	/**
	 * 方法名 ： setfModuleId
	 * 功 能 ： 设置变量 fModuleId 的值
	 */
	public void setfModuleId(String fModuleId) {
		this.fModuleId = fModuleId;
	}
	
	/**
	 * 方法名 ： getfParentId
	 * 功 能 ： 返回变量 fParentId 的值
	 * 
	 * @return: String
	 */
	public String getfParentId() {
		return fParentId;
	}
	
	/**
	 * 方法名 ： setfParentId
	 * 功 能 ： 设置变量 fParentId 的值
	 */
	public void setfParentId(String fParentId) {
		this.fParentId = fParentId;
	}
	
	/**
	 * 方法名 ： getfEnCode
	 * 功 能 ： 返回变量 fEnCode 的值
	 * 
	 * @return: String
	 */
	public String getfEnCode() {
		return fEnCode;
	}
	
	/**
	 * 方法名 ： setfEnCode
	 * 功 能 ： 设置变量 fEnCode 的值
	 */
	public void setfEnCode(String fEnCode) {
		this.fEnCode = fEnCode;
	}
	
	/**
	 * 方法名 ： getfFullName
	 * 功 能 ： 返回变量 fFullName 的值
	 * 
	 * @return: String
	 */
	public String getfFullName() {
		return fFullName;
	}
	
	/**
	 * 方法名 ： setfFullName
	 * 功 能 ： 设置变量 fFullName 的值
	 */
	public void setfFullName(String fFullName) {
		this.fFullName = fFullName;
	}
	
	/**
	 * 方法名 ： getfIcon
	 * 功 能 ： 返回变量 fIcon 的值
	 * 
	 * @return: String
	 */
	public String getfIcon() {
		return fIcon;
	}
	
	/**
	 * 方法名 ： setfIcon
	 * 功 能 ： 设置变量 fIcon 的值
	 */
	public void setfIcon(String fIcon) {
		this.fIcon = fIcon;
	}
	
	/**
	 * 方法名 ： getfUrlAddress
	 * 功 能 ： 返回变量 fUrlAddress 的值
	 * 
	 * @return: String
	 */
	public String getfUrlAddress() {
		return fUrlAddress;
	}
	
	/**
	 * 方法名 ： setfUrlAddress
	 * 功 能 ： 设置变量 fUrlAddress 的值
	 */
	public void setfUrlAddress(String fUrlAddress) {
		this.fUrlAddress = fUrlAddress;
	}
	
	/**
	 * 方法名 ： getfTarget
	 * 功 能 ： 返回变量 fTarget 的值
	 * 
	 * @return: String
	 */
	public String getfTarget() {
		return fTarget;
	}
	
	/**
	 * 方法名 ： setfTarget
	 * 功 能 ： 设置变量 fTarget 的值
	 */
	public void setfTarget(String fTarget) {
		this.fTarget = fTarget;
	}
	
	/**
	 * 方法名 ： getfIsMenu
	 * 功 能 ： 返回变量 fIsMenu 的值
	 * 
	 * @return: Integer
	 */
	public Integer getfIsMenu() {
		return fIsMenu;
	}
	
	/**
	 * 方法名 ： setfIsMenu
	 * 功 能 ： 设置变量 fIsMenu 的值
	 */
	public void setfIsMenu(Integer fIsMenu) {
		this.fIsMenu = fIsMenu;
	}
	
	/**
	 * 方法名 ： getfAllowExpand
	 * 功 能 ： 返回变量 fAllowExpand 的值
	 * 
	 * @return: Integer
	 */
	public Integer getfAllowExpand() {
		return fAllowExpand;
	}
	
	/**
	 * 方法名 ： setfAllowExpand
	 * 功 能 ： 设置变量 fAllowExpand 的值
	 */
	public void setfAllowExpand(Integer fAllowExpand) {
		this.fAllowExpand = fAllowExpand;
	}
	
	/**
	 * 方法名 ： getfIsPublic
	 * 功 能 ： 返回变量 fIsPublic 的值
	 * 
	 * @return: Integer
	 */
	public Integer getfIsPublic() {
		return fIsPublic;
	}
	
	/**
	 * 方法名 ： setfIsPublic
	 * 功 能 ： 设置变量 fIsPublic 的值
	 */
	public void setfIsPublic(Integer fIsPublic) {
		this.fIsPublic = fIsPublic;
	}
	
	/**
	 * 方法名 ： getfAllowEdit
	 * 功 能 ： 返回变量 fAllowEdit 的值
	 * 
	 * @return: Integer
	 */
	public Integer getfAllowEdit() {
		return fAllowEdit;
	}
	
	/**
	 * 方法名 ： setfAllowEdit
	 * 功 能 ： 设置变量 fAllowEdit 的值
	 */
	public void setfAllowEdit(Integer fAllowEdit) {
		this.fAllowEdit = fAllowEdit;
	}
	
	/**
	 * 方法名 ： getfAllowDelete
	 * 功 能 ： 返回变量 fAllowDelete 的值
	 * 
	 * @return: Integer
	 */
	public Integer getfAllowDelete() {
		return fAllowDelete;
	}
	
	/**
	 * 方法名 ： setfAllowDelete
	 * 功 能 ： 设置变量 fAllowDelete 的值
	 */
	public void setfAllowDelete(Integer fAllowDelete) {
		this.fAllowDelete = fAllowDelete;
	}
	
	/**
	 * 方法名 ： getfSortCode
	 * 功 能 ： 返回变量 fSortCode 的值
	 * 
	 * @return: Integer
	 */
	public Integer getfSortCode() {
		return fSortCode;
	}
	
	/**
	 * 方法名 ： setfSortCode
	 * 功 能 ： 设置变量 fSortCode 的值
	 */
	public void setfSortCode(Integer fSortCode) {
		this.fSortCode = fSortCode;
	}
	
	/**
	 * 方法名 ： getfDeleteMark
	 * 功 能 ： 返回变量 fDeleteMark 的值
	 * 
	 * @return: Integer
	 */
	public Integer getfDeleteMark() {
		return fDeleteMark;
	}
	
	/**
	 * 方法名 ： setfDeleteMark
	 * 功 能 ： 设置变量 fDeleteMark 的值
	 */
	public void setfDeleteMark(Integer fDeleteMark) {
		this.fDeleteMark = fDeleteMark;
	}
	
	/**
	 * 方法名 ： getfEnabledMark
	 * 功 能 ： 返回变量 fEnabledMark 的值
	 * 
	 * @return: Integer
	 */
	public Integer getfEnabledMark() {
		return fEnabledMark;
	}
	
	/**
	 * 方法名 ： setfEnabledMark
	 * 功 能 ： 设置变量 fEnabledMark 的值
	 */
	public void setfEnabledMark(Integer fEnabledMark) {
		this.fEnabledMark = fEnabledMark;
	}
	
	/**
	 * 方法名 ： getfDescription
	 * 功 能 ： 返回变量 fDescription 的值
	 * 
	 * @return: String
	 */
	public String getfDescription() {
		return fDescription;
	}
	
	/**
	 * 方法名 ： setfDescription
	 * 功 能 ： 设置变量 fDescription 的值
	 */
	public void setfDescription(String fDescription) {
		this.fDescription = fDescription;
	}
	
	/**
	 * 方法名 ： getfCreateDate
	 * 功 能 ： 返回变量 fCreateDate 的值
	 * 
	 * @return: Date
	 */
	public Date getfCreateDate() {
		return fCreateDate;
	}
	
	/**
	 * 方法名 ： setfCreateDate
	 * 功 能 ： 设置变量 fCreateDate 的值
	 */
	public void setfCreateDate(Date fCreateDate) {
		this.fCreateDate = fCreateDate;
	}
	
	/**
	 * 方法名 ： getfCreateUserId
	 * 功 能 ： 返回变量 fCreateUserId 的值
	 * 
	 * @return: String
	 */
	public String getfCreateUserId() {
		return fCreateUserId;
	}
	
	/**
	 * 方法名 ： setfCreateUserId
	 * 功 能 ： 设置变量 fCreateUserId 的值
	 */
	public void setfCreateUserId(String fCreateUserId) {
		this.fCreateUserId = fCreateUserId;
	}
	
	/**
	 * 方法名 ： getfCreateUserName
	 * 功 能 ： 返回变量 fCreateUserName 的值
	 * 
	 * @return: String
	 */
	public String getfCreateUserName() {
		return fCreateUserName;
	}
	
	/**
	 * 方法名 ： setfCreateUserName
	 * 功 能 ： 设置变量 fCreateUserName 的值
	 */
	public void setfCreateUserName(String fCreateUserName) {
		this.fCreateUserName = fCreateUserName;
	}
	
	/**
	 * 方法名 ： getfModifyDate
	 * 功 能 ： 返回变量 fModifyDate 的值
	 * 
	 * @return: Date
	 */
	public Date getfModifyDate() {
		return fModifyDate;
	}
	
	/**
	 * 方法名 ： setfModifyDate
	 * 功 能 ： 设置变量 fModifyDate 的值
	 */
	public void setfModifyDate(Date fModifyDate) {
		this.fModifyDate = fModifyDate;
	}
	
	/**
	 * 方法名 ： getfModifyUserId
	 * 功 能 ： 返回变量 fModifyUserId 的值
	 * 
	 * @return: String
	 */
	public String getfModifyUserId() {
		return fModifyUserId;
	}
	
	/**
	 * 方法名 ： setfModifyUserId
	 * 功 能 ： 设置变量 fModifyUserId 的值
	 */
	public void setfModifyUserId(String fModifyUserId) {
		this.fModifyUserId = fModifyUserId;
	}
	
	/**
	 * 方法名 ： getfModifyUserName
	 * 功 能 ： 返回变量 fModifyUserName 的值
	 * 
	 * @return: String
	 */
	public String getfModifyUserName() {
		return fModifyUserName;
	}
	
	/**
	 * 方法名 ： setfModifyUserName
	 * 功 能 ： 设置变量 fModifyUserName 的值
	 */
	public void setfModifyUserName(String fModifyUserName) {
		this.fModifyUserName = fModifyUserName;
	}
	
	/**
	 * 方法名 ： getMoveType
	 * 功 能 ： 返回变量 moveType 的值
	 * 
	 * @return: String
	 */
	public String getMoveType() {
		return moveType;
	}
	
	/**
	 * 方法名 ： setMoveType
	 * 功 能 ： 设置变量 moveType 的值
	 */
	public void setMoveType(String moveType) {
		this.moveType = moveType;
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
		return "Authority [fModuleId=" + fModuleId + ", fParentId=" + fParentId + ", fModifyUserId=" + fModifyUserId + ", fModifyUserName=" + fModifyUserName + ", moveType=" + moveType + "]";
	}
	
}
