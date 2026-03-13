package com.klef.fsad.exam.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klef.fsad.exam.model.SupplierOrder;
import com.klef.fsad.exam.repository.SupplierOrderRepository;

@Service
public class SupplierOrderService
{
 @Autowired
 SupplierOrderRepository repo;

 public SupplierOrder addOrder(SupplierOrder o)
 {
  return repo.save(o);
 }

 public List<SupplierOrder> viewOrders()
 {
  return repo.findAll();
 }
}