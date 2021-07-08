package com.tcc2jdh.manager.dao.sys;

import com.tcc2jdh.manager.entity.sys.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import com.tcc2jdh.manager.dao.support.IBaseDao;

@Repository
public interface IUserDao extends IBaseDao<User, Integer> {

    User findByUserName(String username);

    Page<User> findAllByNickNameContaining(String searchText, Pageable pageable);

}
