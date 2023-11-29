package controller;
import java.util.List;
import model.dao.UserInfoDAO;
import model.pojo.Userinfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class UserController {
    ModelAndView mav=new ModelAndView();
    @RequestMapping("index.htm")
    public ModelAndView getUsers()
    {
        List<Userinfo> lst=UserInfoDAO.getUsers();
        mav.addObject("lst",lst);
        mav.setViewName("index");
        return mav;
    }
}
