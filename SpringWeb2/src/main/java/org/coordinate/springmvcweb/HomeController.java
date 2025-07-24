package org.coordinate.springmvcweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller()
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("home method called from controller");
        return "index";
    }

    @RequestMapping("/alien")
    public String alien(){
        System.out.println("alien method called");
        return "alien";
    }

    @RequestMapping("/add")
    //servlet way
//    public String add(HttpServletRequest request, HttpSession session){
//        int num1= Integer.parseInt(request.getParameter("num1"));
//        int num2=Integer.parseInt(request.getParameter("num2"));
//        int result=num1+num2;
//        session.setAttribute("result", result);
//
//        System.out.println("add method called");
//        return "result.jsp";
//
//    }
    //spring way
    public ModelAndView add(@RequestParam("num1") int num1, int num2, ModelAndView modelAndView){
        System.out.println("add method called");
        int result=num1+num2;
        modelAndView.addObject("result", result);
        modelAndView.setViewName("result");
//        session.setAttribute("result", result);
        return modelAndView;

    }

    @RequestMapping("/addalien")
    public String addAlien(@ModelAttribute Alien alien, ModelAndView modelAndView ){
//        Alien alien=new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
//        modelAndView.addObject("alien", alien);
//        modelAndView.setViewName("addalien");
//        return modelAndView;
        return "addalien";

    }
}
