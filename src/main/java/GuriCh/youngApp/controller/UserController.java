package GuriCh.youngApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user/mypage")
    public String userMyPage() {
        return "userMyPage";
    }
}
