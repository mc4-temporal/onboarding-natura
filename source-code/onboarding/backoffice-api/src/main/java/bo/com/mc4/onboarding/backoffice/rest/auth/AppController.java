package bo.com.mc4.onboarding.backoffice.rest.auth;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {


	@RequestMapping("/")
	String home(ModelMap modal) {
		modal.addAttribute("title","Backoffice");
		return "forward:/index.html";
	}

	@RequestMapping({"/configuracion/**",
			"/monitoreo/**",
			"/login",
			"/security/**",
			"/access/**",})
	String partialHandler(/*@PathVariable("page") final String page*/) {
		return "forward:/index.html";
	}



}
