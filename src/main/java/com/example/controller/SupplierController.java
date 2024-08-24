//package com.example.controller;
//import com.example.entity.Supplier;
//import com.example.service.SupplierService;
//
//import jakarta.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/supplier")
//public class SupplierController {
//
//	    @Autowired
//	    private SupplierService supplierService;
//	    
//	    @PostMapping("/save")
//	    public ResponseEntity<String> save(@RequestBody Supplier supplier){
//	    	Supplier sup=supplierService.saveSupplier(supplier);
//	    	return new ResponseEntity<String>("supplier save successfully",HttpStatus.OK);
//	    }
//	    
//
//	    @PostMapping("/query")
//	    public List<Supplier> querySuppliers(@RequestBody SupplierQueryRequest request) {
//	        return supplierService.querySuppliers(
//	            request.getLocation(), 
//	            request.getNatureOfBusiness(), 
//	            request.getManufacturingProcess());
//	    }
 //	}
//
//	class SupplierQueryRequest {
//	    private String location;
//	    private String natureOfBusiness;
//	    private String manufacturingProcess;
//		public String getLocation() {
//			return location;
//		}
//		public void setLocation(String location) {
//			this.location = location;
//		}
//		public String getNatureOfBusiness() {
//			return natureOfBusiness;
//		}
//		public void setNatureOfBusiness(String natureOfBusiness) {
//			this.natureOfBusiness = natureOfBusiness;
//		}
//		public String getManufacturingProcess() {
//			return manufacturingProcess;
//		}
//		public void setManufacturingProcess(String manufacturingProcess) {
//			this.manufacturingProcess = manufacturingProcess;
//		}
//
//	    
//	}


package com.example.controller;
import com.example.entity.Supplier;
import com.example.service.SupplierService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

	    @Autowired
	    private SupplierService supplierService;
	    
	    @PostMapping("/save")
	    public ResponseEntity<String> save(@RequestBody Supplier supplier){
	    	Supplier sup=supplierService.saveSupplier(supplier);
	    	return new ResponseEntity<String>("supplier save successfully",HttpStatus.OK);
	    }
	    

	    @PostMapping("/query")
	    public List<Supplier> querySuppliers(@RequestBody SupplierQueryRequest request ,@RequestParam(value="pagenumber",defaultValue ="1",required = false)Integer pagenumber,
	    @RequestParam(value="pagesize",defaultValue ="5",required = false)Integer pagesize) {
	        return supplierService.querySuppliers(
	            request.getLocation(), 
	            request.getNatureOfBusiness(), 
	            request.getManufacturingProcesses(),
	            pagenumber,
	            pagesize
	            );
	    }
 	}

	class SupplierQueryRequest {
	    private String location;
	    private String natureOfBusiness;
	    private String manufacturingProcesses;
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getNatureOfBusiness() {
			return natureOfBusiness;
		}
		public void setNatureOfBusiness(String natureOfBusiness) {
			this.natureOfBusiness = natureOfBusiness;
		}
		public String getManufacturingProcesses() {
			return manufacturingProcesses;
		}
		public void setManufacturingProcess(String manufacturingProcesses) {
			this.manufacturingProcesses = manufacturingProcesses;
		}

	    
	}

