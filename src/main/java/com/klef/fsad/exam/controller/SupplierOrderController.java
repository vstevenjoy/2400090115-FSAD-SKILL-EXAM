package com.klef.fsad.exam.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.klef.fsad.exam.model.SupplierOrder;
import com.klef.fsad.exam.service.SupplierOrderService;

@RestController
@RequestMapping("/supplierorder")
public class SupplierOrderController
{
 @Autowired
 SupplierOrderService service;

 @PostMapping("/add")
 public SupplierOrder addOrder(@RequestBody SupplierOrder o)
 {
  return service.addOrder(o);
 }

 @GetMapping("/viewall")
 public List<SupplierOrder> viewAll()
 {
  return service.viewOrders();
 }
}