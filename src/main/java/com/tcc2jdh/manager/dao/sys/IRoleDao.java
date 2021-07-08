package com.tcc2jdh.manager.dao.sys;

import com.tcc2jdh.manager.entity.sys.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import com.tcc2jdh.manager.dao.support.IBaseDao;

@Repository
public interface IRoleDao extends IBaseDao<Role, Integer> {

    Page<Role> findAllByNameContainingOrDescriptionContaining(String searchText1, String searchText2, Pageable pageable);

}
