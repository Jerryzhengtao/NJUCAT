package nju.se.zt.njucat.handler;

import com.sun.xml.bind.v2.schemagen.xmlschema.Annotated;
import com.sun.xml.bind.v2.schemagen.xmlschema.Annotation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName ControllerException
 * //TODO
 * @Author zt
 * @Date 2021/2/28 17:01
 **/
@ControllerAdvice
public class ControllerExceptionHandler {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @ExceptionHandler(Exception.class)
    public ModelAndView exception(HttpServletRequest request,Exception e) throws Exception {
        logger.error("Request URL : {}, Exception : {}",request.getRequestURL(),e);
        if(AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class)!=null){
            throw e;
        }
        ModelAndView mv = new ModelAndView();
        mv.addObject("url",request.getRequestURL());
        mv.addObject("exception",e);
        mv.setViewName("error/error");
        return mv;
    }

}
