package org.resort.dao;

import org.apache.ibatis.annotations.Param;
import org.resort.entity.Privilege;

/**
 * @Author 郭文虎
 */
public interface PrivilegeDao extends CommonDao<Privilege> {
    /**
     * 根据父权限编号获取父权限对象
     * @param id 父权限编号
     * @return 父权限对象
     */
    Privilege getParentById(@Param("id") int id);
}
