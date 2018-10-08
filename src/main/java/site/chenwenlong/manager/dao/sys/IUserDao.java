package site.chenwenlong.manager.dao.sys;

import site.chenwenlong.manager.dao.support.IBaseDao;
import site.chenwenlong.manager.entity.sys.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao extends IBaseDao<User, Integer> {

	User findByUserName(String username);

	Page<User> findAllByNickNameContaining(String searchText, Pageable pageable);

}
