package com.richard.Dal;/**
 * Created by highl on 05/03/2017.
 */

import com.richard.Domain.Script;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * created by highl
 */

@Component
public class ScriptRowMapper {

    public RowMapper<Script> get(){
        return new RowMapper<Script>() {
            @Override
            public Script mapRow(ResultSet resultSet, int i) throws SQLException {
                Script script = new Script();
                script.setScriptid(resultSet.getInt("scriptid"));

                return script;
            }
        };
    }
}
