package ai.salesken.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = { "/xxx" })

public class BookController2 {

	public BookController2() {
	}

	@GetMapping()
	public String viewBooks(Model model) {
		model.addAttribute("books", "champa");
		return "xxx.jsp";
	}

	@GetMapping("/yyy")
	public String viewBooks1(Model model) {
		model.addAttribute("books", "champa");
		return "../xxx.jsp";
	}
}