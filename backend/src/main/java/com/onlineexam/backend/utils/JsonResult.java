package com.onlineexam.backend.utils;

public class JsonResult {
    private Integer status;
    private String msg;
    private Object object;

    public JsonResult() {
        this.status=200;
        this.msg="ok";
    }

    public JsonResult(Object object) {
        this.status=200;
        this.msg="ok";
        this.object = object;
    }

    public JsonResult(String msg) {
        this.status = 200;
        this.msg = msg;
        this.object = null;
    }

    public JsonResult(Integer status, String msg, Object object) {
        this.status = status;
        this.msg = msg;
        this.object = object;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "JsonResult{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
}

