package org.resort.service.impl;

import org.resort.dao.StateDao;
import org.resort.entity.State;
import org.resort.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 郭文虎
 */
@Service("stateService")
public class StateServiceImpl implements StateService {
    @Autowired
    StateDao dao;
    @Override
    public List<State> getAllEntity() {
        return dao.getAllEntity();
    }

    @Override
    public State getEntityById(int id) {
        return dao.getEntityById(id);
    }
}
