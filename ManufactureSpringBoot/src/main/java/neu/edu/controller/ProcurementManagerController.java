package neu.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import neu.edu.entity.Materialorder;
import neu.edu.service.MaterialorderService;

@RestController
@RequestMapping("/ManufactureSpringBootProcurementManager")
public class ProcurementManagerController {
	
	@Autowired
	private MaterialorderService materialorderService;
	
	@GetMapping("/viewOrder/{companyName}")
	public @ResponseBody List<Materialorder> viewCompanyOrder(@PathVariable String companyName){

		return materialorderService.viewOrderByCompanyName(companyName);
	}
	

}
