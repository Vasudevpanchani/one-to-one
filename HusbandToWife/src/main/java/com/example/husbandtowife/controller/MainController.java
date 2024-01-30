package com.example.husbandtowife.controller;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.husbandtowife.dto.ResponseDTO;
import com.example.husbandtowife.model.Husband;
import com.example.husbandtowife.model.Wife;
import com.example.husbandtowife.service.HusbandService;
import com.example.husbandtowife.service.WifeService;

@Controller
public class MainController {

	@Autowired
	private HusbandService husbandService;
	
	@Autowired
	private WifeService wifeService;
	
	@GetMapping("/allHusband")
	@ResponseBody
	public ResponseDTO findAllHusband() {
		return husbandService.findAllHusband();
	}
	
	@PostMapping("/addHusband")
	@ResponseBody
	public ResponseDTO addHusband(@RequestBody Husband husband)
	{
		return husbandService.addHusband(husband);
	}
	
	@GetMapping("/allWife")
	@ResponseBody
	public ResponseDTO findAllWife() {
		return wifeService.findAllWifes();
	}
	
	@PostMapping("/addWife")
	@ResponseBody
	public ResponseDTO addWife(@RequestBody Wife wife) {
		return wifeService.addWife(wife);
	}
	
	@PutMapping("/editHusbandByWife")
	@ResponseBody
	public ResponseDTO edtHusbandByWife(@RequestParam("husband_id") long hId, @RequestParam("wife_id") long wId) {
		return husbandService.editHusbandByWife(hId, wId);
	}
	
	@GetMapping("/findHusbandByWife")
	@ResponseBody
	public ResponseDTO findHusbandByWife(@RequestParam("wife_name")String wName) {
		return husbandService.findHusbandByWifeName(wName);
	}
	
	@GetMapping("/findWifeByHusband")
	@ResponseBody
	public ResponseDTO findWifeByHusband(@RequestParam("husband_name") String hName) {
		return wifeService.findWifeByHusbandName(hName);
	}
	
}
