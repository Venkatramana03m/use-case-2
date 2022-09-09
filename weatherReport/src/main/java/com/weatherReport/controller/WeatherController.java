package com.weatherReport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.weatherReport.Domain.Weather;
import com.weatherReport.Repo.WeatherRepo;


@Controller
public class WeatherController {
	
	@Autowired
	 WeatherRepo rep;
	
	  @RequestMapping()
	  public String home() {
		  return "end.jsp";
	  }
	
	 @RequestMapping("/addWeather")
	  public String addWeather( Weather weatherdomain) {
	     rep.save(weatherdomain);
		return "end.jsp";
	}
	 
	 @RequestMapping("/searchId")
	  public ModelAndView searchId(@RequestParam int id) {
		  ModelAndView mv= new ModelAndView("show.jsp");
		  Weather al = rep.findById(id).orElse(new Weather());
		  mv.addObject(al);
		  return mv;
	  }
	  
	 
	 @RequestMapping("/deleteId")
	 public String deleteId(@RequestParam int id) {
		 rep.deleteById(id);
		 return "end.jsp";
	 }

}
