package com.ecommerce.common.base;

import com.ecommerce.common.exception.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Iterator;

public class BaseController {
    Logger logger = LoggerFactory.getLogger(BusinessException.class);

    @ExceptionHandler
    @ResponseBody
    public CommonResult exp(HttpServletRequest request, Exception exception) {
        CommonResult commonResult = new CommonResult();
        if (exception instanceof BusinessException) {
            commonResult.setMessage(exception.getMessage());
            commonResult.setCode(((BusinessException) exception).getCode());
            this.logger.error("errorResponse:{}", commonResult.toString());
        } else {
            this.logger.error("errorResponse:{}", exception.toString());
            commonResult.setCode(500);
            commonResult.setMessage("Sorry!Exception occurs!Please try it later");
        }
        exception.printStackTrace();
        return commonResult;
    }

    public String getErrorResponse(BindingResult bindingResult) {
        StringBuilder errorMessage = new StringBuilder();
        Iterator errIterator = bindingResult.getAllErrors().iterator();
        while (errIterator.hasNext()) {
            ObjectError objectError = (ObjectError) errIterator.next();
            this.logger.info(objectError.getDefaultMessage());
            this.logger.info(objectError.getCode());
            errorMessage.append(objectError.getDefaultMessage()).append(",");
        }
        errorMessage.delete(errorMessage.length() - 1, errorMessage.length());
        return errorMessage.toString();
    }

}
