package tk.ainiyue.danyuan.application.authority.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tk.ainiyue.danyuan.application.authority.dao.AuthorityDao;
import tk.ainiyue.danyuan.application.authority.po.Authority;
import tk.ainiyue.danyuan.application.authority.service.AuthorityService;
import tk.ainiyue.danyuan.application.authority.vo.AuthorityVO;
import tk.ainiyue.danyuan.application.authority.vo.AuthorityzTreeVO;

/**
 * 文件名 ： AuthorityServiceImpl.java
 * 包 名 ： tk.ainiyue.danyuan.application.datacentor.authority.service.impl
 * 描 述 ： TODO(用一句话描述该文件做什么)
 * 作 者 ： Tenghui.Wang
 * 时 间 ： 2016年10月15日 上午11:04:55
 * 版 本 ： V1.0
 */
@Service("authorityService")
public class AuthorityServiceImpl implements AuthorityService {
	
	//
	@Autowired
	private AuthorityDao authorityDao;
	
	/**
	 * 方法名 ： findAll
	 * 功 能 ： TODO(这里用一句话描述这个方法的作用)
	 * 参 数 ： @return
	 * 参 考 ： @see tk.ainiyue.danyuan.application.datacentor.authority.service.
	 * AuthorityService#findAll()
	 * 作 者 ： Tenghui.Wang
	 */
	@Override
	public List<Authority> findAll() {
		// TODO Auto-generated method stub
		return authorityDao.findAll();
	}
	
	/**
	 * 方法名 ： save
	 * 功 能 ： TODO(这里用一句话描述这个方法的作用)
	 * 参 数 ： @param authority
	 * 参 考 ： @see tk.ainiyue.danyuan.application.datacentor.authority.service.
	 * AuthorityService#save(tk.ainiyue.danyuan.application.datacentor.authority
	 * .po.Authority)
	 * 作 者 ： Tenghui.Wang
	 */
	@Override
	public AuthorityzTreeVO save(Authority authority) {
		authorityDao.save(authority);
//		authority = authorityDao.findAllById(authority.getfModuleId());
		AuthorityzTreeVO vo = new AuthorityzTreeVO();
		vo.setId(authority.getfModuleId());
		vo.setName(authority.getfFullName());
		vo.setIconSkin(authority.getfIcon());
		return vo;
		
	}
	
	/**
	 * 方法名 ： findAllByF_ParentId
	 * 功 能 ： TODO(这里用一句话描述这个方法的作用)
	 * 参 数 ： @param id
	 * 参 数 ： @return
	 * 参 考 ： @see
	 * tk.ainiyue.danyuan.application.authority.service.AuthorityService#findAllByF_ParentId(java.lang.String)
	 * 作 者 ： wang
	 */
	@Override
	public List<AuthorityVO> findAllByF_ParentId(String id) {
		List<AuthorityVO> list = null;
		List<Authority> listt = authorityDao.findAllByF_ParentIdOrderByF_SortCode(id);
		// TODO Auto-generated method stub
		if (listt != null && listt.size() > 0) {
			list = new ArrayList<AuthorityVO>();
			for (Authority authority : listt) {
				AuthorityVO vo = new AuthorityVO();
				vo.setId(authority.getfModuleId());
				vo.setName(authority.getfFullName());
				List<AuthorityVO> listt1 = findAllByF_ParentId(authority.getfModuleId());
				vo.setList(listt1);
				list.add(vo);
			}
		}
		return list;
	}
	
	/**
	 * 方法名 ： findzTreeByF_ParentId
	 * 功 能 ： TODO(这里用一句话描述这个方法的作用)
	 * 参 数 ： @param string
	 * 参 数 ： @return
	 * 参 考 ： @see
	 * tk.ainiyue.danyuan.application.authority.service.AuthorityService#findzTreeByF_ParentId(java.lang.String)
	 * 作 者 ： wang
	 */
	
	@Override
	public List<AuthorityzTreeVO> findzTreeByF_ParentId(String id) {
		List<AuthorityzTreeVO> list = null;
		List<Authority> listt = authorityDao.findAllByF_ParentIdOrderByF_SortCode(id);
		// TODO Auto-generated method stub
		if (listt != null && listt.size() > 0) {
			list = new ArrayList<AuthorityzTreeVO>();
			for (Authority authority : listt) {
				AuthorityzTreeVO vo = new AuthorityzTreeVO();
				vo.setId(authority.getfModuleId());
				vo.setName(authority.getfFullName());
				vo.setIcon(authority.getfIcon());
//				vo.setIconSkin(authority.getfIcon());
//				vo.se(authority.getfIcon());
//				vo.setIconOpen("true");
				List<AuthorityzTreeVO> listt1 = findzTreeByF_ParentId(authority.getfModuleId());
				if (listt1 != null) {
					vo.getChildren().addAll(listt1);
				}
				list.add(vo);
			}
		}
		return list;
	}
	
	/**
	 * 方法名 ： findAuthorityByUuid
	 * 功 能 ： 查询
	 * 参 数 ： @param authority
	 * 参 数 ： @return
	 * 参 考 ： @see
	 * tk.ainiyue.danyuan.application.authority.service.AuthorityService#findAuthorityByUuid(tk.ainiyue.danyuan.application.authority.po.Authority)
	 * 作 者 ： wang
	 */
	
	@Override
	public Authority findAuthorityByUuid(Authority authority) {
		return authorityDao.findAllById(authority.getfModuleId());
	}
	
	/**
	 * 方法名 ： deleteAuthority
	 * 功 能 ： TODO(这里用一句话描述这个方法的作用)
	 * 参 数 ： @param authority
	 * 参 数 ： @return
	 * 参 考 ： @see
	 * tk.ainiyue.danyuan.application.authority.service.AuthorityService#deleteAuthority(tk.ainiyue.danyuan.application.authority.po.Authority)
	 * 作 者 ： wang
	 */
	
	@Override
	public void deleteAuthority(Authority authority) {
		List<AuthorityzTreeVO> list = findzTreeByF_ParentId(authority.getfModuleId());
		if (list != null) {
			for (AuthorityzTreeVO authorityzTreeVO : list) {
				authorityDao.delete(authorityzTreeVO.getId());
			}
		}
		authorityDao.delete(authority.getfModuleId());
	}
	
	/**
	 * 方法名 ： updateAuthorityName
	 * 功 能 ： TODO(这里用一句话描述这个方法的作用)
	 * 参 数 ： @param authority
	 * 参 数 ： @return
	 * 参 考 ： @see
	 * tk.ainiyue.danyuan.application.authority.service.AuthorityService#updateAuthorityName(tk.ainiyue.danyuan.application.authority.po.Authority)
	 * 作 者 ： wang
	 */
	
	@Override
	public AuthorityzTreeVO updateAuthorityName(Authority authority) {
		authorityDao.updateAuthorityName(authority.getfFullName(), authority.getfModuleId());
		AuthorityzTreeVO vo = new AuthorityzTreeVO();
		vo.setId(authority.getfModuleId());
		vo.setName(authority.getfFullName());
		vo.setIconSkin(authority.getfIcon());
		return vo;
		
	}
	
	/**
	 * 方法名 ： onDropAuthority
	 * 功 能 ： TODO(这里用一句话描述这个方法的作用)
	 * 参 数 ： @param authorityzTreeVO
	 * 参 数 ： @return
	 * 参 考 ： @see
	 * tk.ainiyue.danyuan.application.authority.service.AuthorityService#onDropAuthority(tk.ainiyue.danyuan.application.authority.vo.AuthorityzTreeVO)
	 * 作 者 ： wang
	 */
	
	@Override
	public AuthorityzTreeVO onDropAuthority(Authority authority) {
		String[] str = authority.getfModuleId().split(",");
		if ("inner".equals(authority.getMoveType())) {
			List<Authority> list = authorityDao.getSize(authority.getfParentId());
			int num = list.size();
			for (String string : str) {
				authorityDao.updateAuthorityName(authority.getfParentId(), num++, string);
			}
		} else {
			Authority temp = authorityDao.getFParentId(authority.getfParentId() == null ? "0" : authority.getfParentId());
			List<Authority> list = authorityDao.findAllByF_ParentIdOrderByF_SortCode(temp.getfParentId());
			int num = 0;
			for (int i = 0; i < list.size(); i++) {
				for (String string : str) {
					if (string.equals(list.get(i).getfModuleId())) {
						list.remove(i);
						i--;
					}
				}
				
			}
			
			if ("prev".equals(authority.getMoveType())) {
				for (Authority authority2 : list) {
					if (temp.getfModuleId().equals(authority2.getfModuleId())) {
						for (String string : str) {
							authorityDao.updateAuthorityName(temp.getfParentId(), num++, string);
						}
					}
					authorityDao.updateAuthorityName(temp.getfParentId(), num++, authority2.getfModuleId());
				}
			} else if ("next".equals(authority.getMoveType())) {
				for (Authority authority2 : list) {
					authorityDao.updateAuthorityName(temp.getfParentId(), num++, authority2.getfModuleId());
					if (temp.getfModuleId().equals(authority2.getfModuleId())) {
						for (String string : str) {
							authorityDao.updateAuthorityName(temp.getfParentId(), num++, string);
						}
					}
				}
			}
		}
		return new AuthorityzTreeVO();
	}
	
}
