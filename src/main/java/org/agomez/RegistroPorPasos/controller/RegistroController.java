package org.agomez.RegistroPorPasos.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.agomez.RegistroPorPasos.model.Colecciones;
import org.agomez.RegistroPorPasos.model.DatosBancarios;
import org.agomez.RegistroPorPasos.model.DatosPersonales;
import org.agomez.RegistroPorPasos.model.DatosProfesionales;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("registro")
public class RegistroController {

	
	/**
	 * @param sol
	 * @return
	 */
	@GetMapping("/datosPersonales")
	public ModelAndView datosPersonales(HttpServletRequest sol) {
		ModelAndView mAV = new ModelAndView();

		DatosPersonales datos = new DatosPersonales();

		if (sol.getSession().getAttribute("datosPersonales") != null) {
			datos = (DatosPersonales)sol.getSession().getAttribute("datosPersonales");
		}

		mAV.addObject("datosNavegacion",Colecciones.datosNavegacion);
		mAV.addObject("listaGenerosOrdenada", Colecciones.listaGenerosOrdenada);
		mAV.addObject("datosPersonales",datos);
		mAV.addObject("nacionalidades",Colecciones.nacionalidades);
		mAV.setViewName("DatosPersonales");
		return mAV;
	}

	/**
	 * @param datos
	 * @param sol
	 * @return
	 */
	@PostMapping("/datosPersonales")
	public ModelAndView guardaDatosPersonales(DatosPersonales datos, HttpServletRequest sol) {
		ModelAndView mAV = new ModelAndView();

		sol.getSession().setAttribute("datosPersonales", datos);

		mAV.setViewName("redirect:datosProfesionales");
		return mAV;
	}

	/**
	 * @param sol
	 * @return
	 */
	@GetMapping("/datosProfesionales")
	public ModelAndView datosProfesionales(HttpServletRequest sol) {
		ModelAndView mAV = new ModelAndView();

		DatosProfesionales datos = new DatosProfesionales();
		if (sol.getSession().getAttribute("datosProfesionales") != null) {
			datos = (DatosProfesionales)sol.getSession().getAttribute("datosProfesionales");
		}
		mAV.addObject("datosNavegacion",Colecciones.datosNavegacion);
		mAV.addObject("datosProfesionales",datos);
		mAV.addObject("departamentos",Colecciones.departamentos);
		mAV.setViewName("DatosProfesionales");
		return mAV;
	}

	/**
	 * @param datos
	 * @param sol
	 * @return
	 */
	@PostMapping("/datosProfesionales")
	public ModelAndView guardaDatosProfesionales(DatosProfesionales datos, HttpServletRequest sol) {
		ModelAndView mAV = new ModelAndView();
		
		sol.getSession().setAttribute("datosProfesionales", datos);
		mAV.setViewName("redirect:datosBancarios");
		return mAV;
	}

	/**
	 * @param sol
	 * @return
	 */
	@GetMapping("/datosBancarios")
	public ModelAndView datosBancarios(HttpServletRequest sol) {
		ModelAndView mAV = new ModelAndView();
		
		DatosBancarios datos = new DatosBancarios();
		if (sol.getSession().getAttribute("datosBancarios") != null) {
			datos = (DatosBancarios)sol.getSession().getAttribute("datosBancarios");
		}
		mAV.addObject("datosBancarios",datos);
		mAV.addObject("datosNavegacion",Colecciones.datosNavegacion);
		mAV.setViewName("DatosBancarios");
		return mAV;
	}

	/**
	 * @param datos
	 * @param sol
	 * @return
	 */
	@PostMapping("/datosBancarios")
	public ModelAndView guardaDatosBancarios(DatosBancarios datos, HttpServletRequest sol) {
		ModelAndView mAV = new ModelAndView();
		
		sol.getSession().setAttribute("datosBancarios", datos);
		
		mAV.setViewName("redirect:resumen");
		return mAV;
	}

	/**
	 * @param sol
	 * @return
	 */
	@GetMapping("/resumen")
	public ModelAndView resumen(HttpServletRequest sol) {
		ModelAndView mAV = new ModelAndView();
		
		DatosPersonales datosPersonales = new DatosPersonales();
		if (sol.getSession().getAttribute("datosPersonales") != null) {
			datosPersonales = (DatosPersonales)sol.getSession().getAttribute("datosPersonales");
		}
		
		DatosProfesionales datosProfesionales = new DatosProfesionales();
		if (sol.getSession().getAttribute("datosProfesionales") != null) {
			datosProfesionales = (DatosProfesionales)sol.getSession().getAttribute("datosProfesionales");
		}
		
		DatosBancarios datosBancarios = new DatosBancarios();
		if (sol.getSession().getAttribute("datosBancarios") != null) {
			datosBancarios = (DatosBancarios)sol.getSession().getAttribute("datosBancarios");
		}
		
		mAV.addObject("datosPersonales",datosPersonales);
		mAV.addObject("datosProfesionales",datosProfesionales);
		mAV.addObject("datosBancarios",datosBancarios);
		mAV.addObject("nacionalidades",Colecciones.nacionalidades);
		mAV.addObject("listaGenerosOrdenada", Colecciones.listaGenerosOrdenada);
		mAV.addObject("departamentos",Colecciones.departamentos);
		mAV.addObject("datosNavegacion",Colecciones.datosNavegacion);
		mAV.setViewName("Resumen");
		return mAV;
	}

	@PostMapping("/resumen")
	public ModelAndView cierraSesion(HttpServletRequest sol) {
		
		ModelAndView mAV = new ModelAndView();

		sol.getSession().invalidate();
		mAV.setViewName("redirect:datosPersonales");
		return mAV;
	}

}
