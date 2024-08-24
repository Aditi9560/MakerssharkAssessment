package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Supplier {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long supplierId;

	    private String companyName;
	    private String website;
	    private String location;
	    private String natureOfBusiness; // small_scale, medium_scale, large_scale
	    private String manufacturingProcesses; // e.g., "moulding,3d_printing"
		public Long getSupplierId() {
			return supplierId;
		}
		public Supplier() {
			
		}
		public Supplier(Long supplierId, String companyName, String website, String location, String natureOfBusiness,
				String manufacturingProcesses) {
			super();
			this.supplierId = supplierId;
			this.companyName = companyName;
			this.website = website;
			this.location = location;
			this.natureOfBusiness = natureOfBusiness;
			this.manufacturingProcesses = manufacturingProcesses;
		}

		public void setSupplierId(Long supplierId) {
			this.supplierId = supplierId;
		}
		public String getCompanyName() {
			return companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		public String getWebsite() {
			return website;
		}
		public void setWebsite(String website) {
			this.website = website;
		}
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
		public void setManufacturingProcesses(String manufacturingProcesses) {
			this.manufacturingProcesses = manufacturingProcesses;
		}

	   
	}


