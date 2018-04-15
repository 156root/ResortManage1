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

    /**
     * 添加一条数据
     * @param entity 将要添加的数据
     * @return 受影响行数
     */
    int addEntity(@Param("entity") E entity);

    /**
     * 根据编号删除一条数据
     * @param id 将要删除数据的编号
     * @return 受影响行数
     */
    int delEntity(@Param("id") int id);

    List<E> getPartEntityByStateId(@Param("stateId") int stateId);
}
