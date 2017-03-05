package com.richard.Domain;/**
 * Created by highl on 05/03/2017.
 */

/**
 * created by highl
 */
public class Script {

    private int scriptid;
    private String name;
    private String details;
    private String script_usage;
    private String description;
    private String code;
    private String signature;
    private String errortexts;
    private int varid;
    private int timeout;
    private int flags;
    private boolean active;
    private int category_id;
    private String argment_definition;

    public int getScriptid() {
        return scriptid;
    }

    public void setScriptid(int scriptid) {
        this.scriptid = scriptid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getScript_usage() {
        return script_usage;
    }

    public void setScript_usage(String script_usage) {
        this.script_usage = script_usage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getErrortexts() {
        return errortexts;
    }

    public void setErrortexts(String errortexts) {
        this.errortexts = errortexts;
    }

    public int getVarid() {
        return varid;
    }

    public void setVarid(int varid) {
        this.varid = varid;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public int getFlags() {
        return flags;
    }

    public void setFlags(int flags) {
        this.flags = flags;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getArgment_definition() {
        return argment_definition;
    }

    public void setArgment_definition(String argment_definition) {
        this.argment_definition = argment_definition;
    }
}
