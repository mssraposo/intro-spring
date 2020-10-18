package br.com.unipe.aula.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.unipe.aula.dao.TorcedorDAO;
import br.com.unipe.aula.model.Conversor;
import br.com.unipe.aula.model.Torcedor;

@Controller
public class WelcomeController {
	
	@Autowired
	private TorcedorDAO dao;
	
	public WelcomeController() {
		dao = new TorcedorDAO();
	}

	/* @RequestMapping(value = "/teste", method = RequestMethod.GET)
	public String welcome() {
		return "welcome";
	}
	
	
	@RequestMapping(value = "/outraforma", method = RequestMethod.GET)
	public ModelAndView outraForma() {
		ModelAndView view = new ModelAndView("welcome");
		
		view.addObject("mensagem", "View com parâmetro funcionando com sucesso!");
		
		return view;
	} */
	
	
	@RequestMapping(value = "/formulario", method = RequestMethod.GET)
	public ModelAndView formulario(Model model) {
		model.addAttribute("torcedor", new Torcedor());
		return new ModelAndView("formulario");
	}
	
	@RequestMapping(value = "/formulario", method = RequestMethod.POST)
	public ModelAndView exibeTime(@ModelAttribute Torcedor torcedor) {
		ModelAndView view = new ModelAndView("formulario");
		view.addObject("mensagem", torcedor.getNome() + " torce para o " + torcedor.getTime());
		return view;
	}	
	
	@PostMapping(value = "/cadastro")
	public ModelAndView cadastrarTorcedor(@ModelAttribute Torcedor torcedor) {
		
		
		dao.salvar(torcedor);
		
		ModelAndView view = new ModelAndView("formulario");
		view.addObject("mensagem2", "Torcedor cadastrado com sucesso!");
		view.addObject("torcedores", dao.getAll());
		
		return view;
	}
	
	
	
	@RequestMapping(value = "/conversor", method = RequestMethod.GET)
	public ModelAndView conversor(Model model) {
		model.addAttribute("conversor", new Conversor());
		return new ModelAndView("conversor");
	}
	
	@RequestMapping(value = "/conversor", method = RequestMethod.POST)
	public ModelAndView exibeConversor(@ModelAttribute Conversor conversor) {
		ModelAndView view = new ModelAndView("conversor");
		view.addObject("mensagem", "R$" + conversor.getReal() + ", convertido em dolar: U$" + conversor.Converter());
		return view;
	}	
	
	
	

}
