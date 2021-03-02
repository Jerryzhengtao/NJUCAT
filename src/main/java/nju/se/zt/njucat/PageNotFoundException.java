package nju.se.zt.njucat;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @ClassName PageNotFoundException
 * //TODO
 * @Author zt
 * @Date 2021/2/28 17:21
 **/
@ResponseStatus(HttpStatus.NOT_FOUND)
public class PageNotFoundException  extends RuntimeException {
    public PageNotFoundException(){

    }
    public PageNotFoundException(String s){
        super(s);
    }

}
