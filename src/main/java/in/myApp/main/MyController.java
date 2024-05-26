package in.myApp.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.myApp.beans.User;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
//	@RequestMapping(value = "/helloPage", method = RequestMethod.GET)
	@GetMapping("/helloPage")
	public ModelAndView openHelloPage() {
		System.out.println("openHelloPage() method executed");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		return mav;
	}
    @GetMapping("/aboutUs")
    public String openAboutUs() {
    	return "about-us";
    }
   
    @GetMapping("/myForm")
    public String openForm() {
    	return "myForm";
    }
//    @PostMapping("/submitForm")
//    public String handleMyForm(HttpServletRequest req) {
//    	String name = req.getParameter("name");
//    	String phone = req.getParameter("phno");
//    	String email = req.getParameter("email");
//    	String city = req.getParameter("city");
//    	System.out.println(name+" "+ phone+" "+email+" "+ city);
//    	
//    	return "profile";
//    }
//    @PostMapping("/submitForm")
//    public String handleMyForm(
//    		@RequestParam("name") String name,
//    		@RequestParam("phno") String phone,
//    		@RequestParam("email") String email,
//    		@RequestParam("city") String city
//    		) {
//    
//    	System.out.println(name+" "+ phone+" "+email+" "+ city);
//    	
//    	return "profile";
//    }
    
//    @PostMapping("/submitForm")
//    public String handleMyForm(
//    		@RequestParam("name") String name,
//    		@RequestParam("phno") String phone,
//    		@RequestParam("email") String email,
//    		@RequestParam("city") String city,
//    		Model model
//    		) {
//    	model.addAttribute("NAME", name);
//    	model.addAttribute("PHONE", phone);
//    	model.addAttribute("EMAIL", email);
//    	model.addAttribute("CITY", city);
//    
//    	System.out.println(name+" "+ phone+" "+email+" "+ city);
//    	
//    	return "profile";
//    }
    
//    @PostMapping("/submitForm")
//    public String handleMyForm(
//    		@RequestParam("name") String name,
//    		@RequestParam("phno") String phone,
//    		@RequestParam("email") String email,
//    		@RequestParam("city") String city,
//    		Model model
//    		) {
//    	User user = new User();
//    	user.setName(name);
//    	user.setPhonenum(phone);
//    	user.setEmail(email);
//    	user.setCity(city);
//    	model.addAttribute("model_user", user);
//    
//    	System.out.println(name+" "+ phone+" "+email+" "+ city);
//    	
//    	return "profile";
//    }
    
    @PostMapping("/submitForm")
    public String handleMyForm(
    		@ModelAttribute("model_user") User user) {
    	
    
    	System.out.println(user.getName()+" "+ user.getPhonenum()+" "+user.getEmail()+" "+ user.getCity());
    	
    	return "profile";
    }
}
