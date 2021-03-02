package nju.se.zt.njucat.web;

import nju.se.zt.njucat.PageNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName IndexController
 * //TODO
 * @Author zt
 * @Date 2021/2/28 16:55
 **/
@Controller
public class IndexController {
    @GetMapping("/")
    public String index()  {
     /*   int i=9/0;
        String blog = null;
        if(blog==null){
            throw new PageNotFoundException("网页不存在");
        }
        */
        System.out.println("---------index-----------");
        return "index";
    }

    @GetMapping("/blog")
    public String blog()  {
        System.out.println("---------blog-----------");
        return "blog";
    }
}
