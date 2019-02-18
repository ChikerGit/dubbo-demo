package com.deepexi.product.extension;

import com.deepexi.util.config.Payload;
import com.deepexi.util.constant.ContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * @author donh
 * @date 2018/5/15.
 */
@Component
@Provider
public class ExceptionHandler implements ExceptionMapper<Exception> {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Response toResponse(Exception e) {
        logger.error("Api exception mapper successfully got an exception: ", e);

        if (e instanceof ApplicationException) {
            String msg = e.getMessage();
            String[] msg_arr = msg.replaceAll("^@|@$", "").trim().split("@");
            // 返回Restful响应码
            return Response.status(Integer.valueOf(msg_arr[0].trim())).entity(new Payload(null, msg_arr[1], msg_arr[2])).type(ContentType.APPLICATION_JSON_UTF_8).build();
        } else {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new Payload(null,"500","Internal Server Error.")).type(ContentType.APPLICATION_JSON_UTF_8).build();
        }
    }
}
