package ai.salesken.webapp.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

	public BookController() {
	}

	@GetMapping("/viewBooks")
	public String viewBooks(Model model, @AuthenticationPrincipal OidcUser principal) {
		if (principal != null) {
			model.addAttribute("profile", principal.getClaims());
		}
		model.addAttribute("books", "champa");
		return "xxx.jsp";
	}
}