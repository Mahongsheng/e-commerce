package com.ecommerce.common.exception;

public class BusinessException extends RuntimeException {
    public static final BusinessException USERNAME_NOT_EXISTS = new BusinessException(504, "user doesn't exist", new Object[0]);
    public static final BusinessException PASSWORD_ERROR = new BusinessException(504, "password is wrong", new Object[0]);
    public static final BusinessException INSERT_FAIL = new BusinessException(504, "add operation failed", new Object[0]);
    public static final BusinessException UPDATE_FAIL = new BusinessException(504, "update operation failed", new Object[0]);
    public static final BusinessException DELETE_FAIL = new BusinessException(504, "delete operation failed", new Object[0]);
    public static final BusinessException USERID_NULL_ERROR = new BusinessException(504, "userid shouln't be null", new Object[0]);
    public static final BusinessException SELECT_FAIL = new BusinessException(504, "there is no data in database", new Object[0]);
    public static final BusinessException USERNAME_DUPLICATE = new BusinessException(504,"account name already exist",new Object[0]);

    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public BusinessException() {
    }

    public BusinessException(int code, String msg, Object... args) {
        super(String.format(msg, args));
        this.code = code;
        this.msg = String.format(msg, args);
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException newInstance(String msg, Object... args) {
        return new BusinessException(this.code, msg, args);
    }


}
