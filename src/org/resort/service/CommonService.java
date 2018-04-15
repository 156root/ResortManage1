package org.resort.service;

import java.util.List;

/**
 * @Author 郭文虎
 * @param <E> 所需的实体类
 */
public interface CommonService<E> {
    /**
     * 获取所有
     * @return 所有信息集合
     */
    List<E> getAllEntity();

    /**
     * 根据编号获取对象
     * @param id 编号
     * @return 该对象
     */
    E getEntityById(int id);


}
