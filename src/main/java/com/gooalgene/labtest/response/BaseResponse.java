package com.gooalgene.labtest.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

/**
 * 2019/10/9 16:44
 *
 * @author XL
 * @version 1.0
 */
@Setter
@Getter
public class BaseResponse<T> {
    private T result;

    private Integer code = 0;

    public void setResultCode(HttpStatus httpStatus) {
        this.code = httpStatus.value();
    }

    public BaseResponse() {

    }

    public BaseResponse(T result) {
        this.result = result;
    }
}
