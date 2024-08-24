package com.example.service;
import com.example.entity.Supplier;
import com.example.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import java.util.List;

	@Service
	public class SupplierService {

	    @Autowired
	    private SupplierRepository supplierRepository;

	    public List<Supplier> querySuppliers(String location, String natureOfBusiness, String manufacturingProcesses,Integer pagenumber,Integer pagesize) {
	    	pagenumber = pagenumber <= 0 ? 0 : pagenumber-1;
	    	pagesize = pagesize <= 0 ? 1 : pagesize;
	    	org.springframework.data.domain.Pageable p=PageRequest.of(pagenumber, pagesize);
	    	
	    	Page<Supplier> supplier=supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcesses(
		            location, natureOfBusiness, manufacturingProcesses,p);
	    	List<Supplier> suppliers=supplier.getContent();
           return suppliers;
	    }
	    
	    public Supplier saveSupplier(Supplier supplier) {
	        // Save the supplier and return the saved entity
	        return supplierRepository.save(supplier);
	    }
	}
