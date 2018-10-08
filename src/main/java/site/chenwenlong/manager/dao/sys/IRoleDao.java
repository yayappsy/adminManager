package site.chenwenlong.manager.dao.sys;

import site.chenwenlong.manager.dao.support.IBaseDao;
import site.chenwenlong.manager.entity.sys.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleDao extends IBaseDao<Role, Integer> {

	Page<Role> findAllByNameContainingOrDescriptionContaining(String searchText1, String searchText2, Pageable pageable);

}
