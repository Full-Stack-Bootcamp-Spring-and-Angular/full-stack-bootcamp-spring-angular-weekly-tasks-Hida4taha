package main.com.myApp.controller;

import main.model.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController
{

    @RequestMapping("/")
    public String showHomePage(Model model)
    {
        UserData userData = new UserData();
        model.addAttribute("userData",userData);
        return "formPage";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("userData")UserData userData , Model model)
    {
String modifyusername = userData.getName().toUpperCase();
      userData.setName(modifyusername);
      model.addAttribute("userData",userData);
        return "resultPage";
    }
}


