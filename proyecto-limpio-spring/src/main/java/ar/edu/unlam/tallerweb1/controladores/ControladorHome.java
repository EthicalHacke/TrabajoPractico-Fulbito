package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorHome {
	
	@RequestMapping(path="/MostrarTabla")
	public ModelAndView MostrarTabla() {
		ModelMap model = new ModelMap();
		
		return new ModelAndView("", model);
	}
}
