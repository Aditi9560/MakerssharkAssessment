//package com.example.repository;
//import com.example.entity.Supplier;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import java.util.List;
//
//public interface SupplierRepository extends JpaRepository<Supplier, Long> {
//    List<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(
//        String location, String natureOfBusiness, String manufacturingProcess);
//}
//

package com.example.repository;

import com.example.entity.Supplier;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    Page<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcesses(
        String location, String natureOfBusiness, String manufacturingProcess,Pageable p);
}
