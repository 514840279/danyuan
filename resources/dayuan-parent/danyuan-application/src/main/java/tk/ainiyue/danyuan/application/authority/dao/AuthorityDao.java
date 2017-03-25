package tk.ainiyue.danyuan.application.authority.dao;

import java.util.List;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tk.ainiyue.danyuan.application.authority.po.Authority;

@Repository("authorityDao")
@DynamicUpdate(true)
@DynamicInsert(true)
public interface AuthorityDao extends CrudRepository<Authority, String> {
	
	/**
	 * 方法名： findAllByF_ParentIdOrderByF_SortCode
	 * 功 能： 菜单查询
	 * 参 数： @param F_ParentId
	 * 参 数： @return
	 * 返 回： List<Authority>
	 * 作 者 ： wang
	 * @throws
	 */
	@Query("select t from Authority t where t.fParentId =?1 order by t.fSortCode")
	public List<Authority> findAllByF_ParentIdOrderByF_SortCode(String F_ParentId);
	
	/**
	 * 方法名 ： findAll
	 * 功 能 ： 查询全部数据
	 * 参 数 ： @return
	 * 参 考 ： @see org.springframework.data.repository.CrudRepository#findAll()
	 * 作 者 ： wang
	 */
	@Override
	@Query("select t from Authority t  order by t.fSortCode")
	public List<Authority> findAll();
	
	/**
	 * 方法名： findAllById
	 * 功 能：找到一条数据
	 * 参 数： @return
	 * 返 回： Authority
	 * 作 者 ： wang
	 * @throws
	 */
	@Query("select t from Authority t  where t.fModuleId =:fModuleId")
	public Authority findAllById(@Param("fModuleId") String fModuleId);
	
	/**
	 * 方法名： updateAuthorityName
	 * 功 能： 更新名称
	 * 参 数： @param getfFullName
	 * 参 数： @param getfModuleId
	 * 返 回： void
	 * 作 者 ： wang
	 * @throws
	 */
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("update Authority t  set t.fFullName=:getfFullName where t.fModuleId =:getfModuleId")
	public void updateAuthorityName(@Param("getfFullName") String getfFullName, @Param("getfModuleId") String getfModuleId);
	
	/**
	 * 方法名： getSize
	 * 功 能： TODO(这里用一句话描述这个方法的作用)
	 * 参 数： @param getfParentId
	 * 参 数： @return
	 * 返 回： int
	 * 作 者 ： wang
	 * @throws
	 */
	@Query("select t from Authority t  where t.fParentId =:fParentId")
	public List<Authority> getSize(@Param("fParentId") String fParentId);
	
	/**
	 * 方法名： updateAuthorityName
	 * 功 能： TODO(这里用一句话描述这个方法的作用)
	 * 参 数： @param getfParentId
	 * 参 数： @param i
	 * 参 数： @param str
	 * 返 回： void
	 * 作 者 ： wang
	 * @throws
	 */
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("update Authority t  set t.fParentId=:fParentId,t.fSortCode=:fSortCode where t.fModuleId =:fModuleId")
	public void updateAuthorityName(@Param("fParentId") String fParentId, @Param("fSortCode") int fSortCode, @Param("fModuleId") String fModuleId);
	
	/**
	 * 方法名： getFParentId
	 * 功 能： TODO(这里用一句话描述这个方法的作用)
	 * 参 数： @param getfParentId
	 * 参 数： @return
	 * 返 回： String
	 * 作 者 ： wang
	 * @throws
	 */
	@Query("select t from Authority t  where t.fModuleId =:fModuleId")
	public Authority getFParentId(@Param("fModuleId") String fModuleId);
	
}
