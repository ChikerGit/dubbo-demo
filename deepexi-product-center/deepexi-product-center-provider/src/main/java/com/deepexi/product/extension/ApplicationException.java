package com.deepexi.product.extension;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.Response;
import java.io.Serializable;

/**
 * Created by VectorHo on 2016/10/15.
 * <p/>
 * 自定义异常包装类, 封装Restfyul http响应码.
 * <p/>
 * msg: HTTP_status_codes
 */
public class ApplicationException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = -7110316208734638051L;

    protected Logger logger = LoggerFactory.getLogger(this.getClass());


    public ApplicationException() {
        super();
    }

    public ApplicationException(Response.Status status, String msg) {
        super(status.getStatusCode() + "@" + status.getStatusCode() + "@" + msg);
    }

    public ApplicationException(Response.Status status, String code, String msg) {
        super(status.getStatusCode() + "@" + code + "@" + msg);
    }

    public ApplicationException(Response.Status status, String msg, Exception e) {
        super(status.getStatusCode() + "@" + msg, e);
    }
}

