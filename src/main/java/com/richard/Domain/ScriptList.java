package com.richard.Domain;/**
 * Created by highl on 05/03/2017.
 */

import org.springframework.hateoas.ResourceSupport;

import java.util.List;

/**
 * created by highl
 */
public class ScriptList extends ResourceSupport {

    private List<Script> scripts;

    public List<Script> getScripts() {
        return scripts;
    }

    public void setScripts(List<Script> scripts) {
        this.scripts = scripts;
    }
}
