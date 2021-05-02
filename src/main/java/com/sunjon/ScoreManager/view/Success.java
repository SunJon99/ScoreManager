package com.sunjon.ScoreManager.view;

/**
 * 返回操作成功的消息，但是没有实质内容
 */
public class Success {
    private Integer code;

    public Success(){
        this(0);
    }
    public Success(Integer code){
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
