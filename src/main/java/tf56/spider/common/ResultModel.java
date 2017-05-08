package tf56.spider.common;

import java.io.Serializable;

/**
 * 统一返回标准
 *
 * @author dy
 *         JDK-version:  JDK1.7
 * @since 2017.5.7
 */
public class ResultModel<T> implements Serializable {

    /**
     * 接口调用是否执行成功
     * ture 成功、false 失败
     */
    private boolean result = true;

    /**
     * 接口调用返回对象模型
     */
    private T model;

    /**
     * 接口调用失败code
     */
    private String errorCode;
    /**
     * 接口调用信息
     */
    private String message;

    /**
     * 接口调用异常类
     */
    private Exception exception;

    public ResultModel() {}

    public ResultModel(boolean result, String errorCode, String message) {
        this.result = result;
        this.errorCode = errorCode;
        this.message = message;
    }

    public ResultModel(T model) {
        this.model = model;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }
}
