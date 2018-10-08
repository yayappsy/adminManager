package site.chenwenlong.manager.dao.sys;

import site.chenwenlong.manager.dao.support.IBaseDao;
import site.chenwenlong.manager.entity.sys.Resource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IResourceDao extends IBaseDao<Resource, Integer> {

	@Modifying
	@Query(nativeQuery = true,value = "DELETE FROM tb_role_resource WHERE resource_id = :id")
	void deleteGrant(@Param("id") Integer id);

	Page<Resource> findAllByNameContaining(String searchText, Pageable pageable);

	List<Resource> findAllByOrderByParentAscIdAscSortAsc();

}
