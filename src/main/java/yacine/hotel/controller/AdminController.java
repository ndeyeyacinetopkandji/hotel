package yacine.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import yacine.hotel.services.ReservationService;

@RestController
@RequestMapping("admin")
public class AdminController {
@Autowired
	ReservationService service;
	
	public String index(ModelMap model) {
		model.addAttribute("reservations" );
		return " admin_reservation.html";
	}
}
