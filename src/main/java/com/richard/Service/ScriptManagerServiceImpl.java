package com.richard.Service;/**
 * Created by highl on 05/03/2017.
 */

import com.richard.Dal.InternalDao;
import com.richard.Domain.ScriptList;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * created by highl
 */
@Service
public class ScriptManagerServiceImpl implements ScriptManagerService {

    InternalDao internalDao;

    @Inject
    public ScriptManagerServiceImpl(InternalDao internalDao){
        this.internalDao = internalDao;
    }


    @Override
    public ScriptList getScriptList() {
        return internalDao.fetchScriptList();
    }
}
