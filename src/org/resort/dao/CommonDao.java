package org.resort.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommonDao<E> {
    /**
     * 获取所有
     * @return 该类型的所有集合
     */
    List<E> getAllEntity();

    /**
     * 根据编号获取一个对象
     * @param id 编号
     * @return 对应的对象
     */
    E getEntityById(@Param("id") int id);
}
