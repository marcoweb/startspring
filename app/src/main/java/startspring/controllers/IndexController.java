package startspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String home(@RequestParam("nome") String nome, Model model) {
        model.addAttribute("nome", nome);
        return "WEB-INF/index.jsp"; 
    }
}
