package co.grandcircus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class FirstController {
	
	@RequestMapping("/review") 
	public String displayReview() {
		return "review";
	}

	@RequestMapping("/confirmation")
	public String displayConfirmation() {
		return "confirmation";
}
	

}
