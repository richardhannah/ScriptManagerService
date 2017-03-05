package com.richard.Dal;/**
 * Created by highl on 05/03/2017.
 */

import com.richard.Domain.Script;
import com.richard.Domain.ScriptList;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;

/**
 * created by highl
 */
@Repository
public class InternalDaoImpl implements InternalDao {

    private NamedParameterJdbcTemplate internalJdbcTemplate;
    private RowMapper<Script> scriptRowMapper;


    @Inject
    public InternalDaoImpl(NamedParameterJdbcTemplate internalJdbcTemplate, ScriptRowMapper scriptRowmapper){
        this.internalJdbcTemplate = internalJdbcTemplate;
        this.scriptRowMapper = scriptRowmapper.get();
    }


    @Override
    public ScriptList fetchScriptList() {

        ScriptList scriptList = new ScriptList();

        List<Script> scripts = internalJdbcTemplate.query("select * from script_manager.script LIMIT 10",scriptRowMapper);
        scriptList.setScripts(scripts);

        return scriptList;
    }
}
