package com.fanzs.secondskill.result;

/**
 * Created by fzs on 2018/3/31.
 */
public class CodeMsg {
    private int code;
    private String msg;

    public CodeMsg(int code,String msg) {
        this.msg = msg;
        this.code = code;
    }

    public CodeMsg fillArgs(Object...args){
        int code=this.code;
        String message=String.format(this.msg,args);
        return new CodeMsg(code,message);
    }


    Class clazz;
    Object obj;

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }

    //通用异常
    public static CodeMsg SUCCESS=new CodeMsg(0,"success");
    public static CodeMsg SERVER_ERROR=new CodeMsg(500100,"服务端异常");
    public static CodeMsg BIND_ERROR=new CodeMsg(500101,"参数校验异常:%s");
    //登录模块
    public static CodeMsg SESSION_ERROR=new CodeMsg(500210,"session 不存在或者已失效");
    public static CodeMsg PASSWORD_EMPTY=new CodeMsg(500211,"登录密码不能为空");
    public static CodeMsg PASSWORD_ERROR=new CodeMsg(500215,"登录密码错误");
    public static CodeMsg MOBILE_EMPTY=new CodeMsg(500212,"手机号不能为空");
    public static CodeMsg MOBILE_ERROR=new CodeMsg(500213,"手机号填写错误");
    public static CodeMsg MOBILE_NOT_EXIST=new CodeMsg(500214,"手机号不存在");
    //商品模块
    //订单模块
    //秒杀模块
    public static CodeMsg SECONDSKILL_OVER=new CodeMsg(500500,"商品已经抢购完！");
    public static CodeMsg SECONDSKILL_REPEAT=new CodeMsg(500501,"每人限购一件！");


}
