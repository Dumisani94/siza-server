package com.siza.server.controller;
import com.siza.server.entity.ServiceRequest; import com.siza.server.service.ServiceRequestService; import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/service-requests") public class WorkflowController {
 private final ServiceRequestService service; public WorkflowController(ServiceRequestService s){service=s;}
 @PatchMapping("/{id}/accept") public ServiceRequest accept(@PathVariable Long id){var r=service.find(id);r.setStatus("ACCEPTED");return service.save(r);}
 @PatchMapping("/{id}/reject") public ServiceRequest reject(@PathVariable Long id){var r=service.find(id);r.setStatus("REJECTED");return service.save(r);}
 @PatchMapping("/{id}/start") public ServiceRequest start(@PathVariable Long id){var r=service.find(id);r.setStatus("IN_PROGRESS");return service.save(r);}
 @PatchMapping("/{id}/complete") public ServiceRequest complete(@PathVariable Long id){var r=service.find(id);r.setStatus("COMPLETED");return service.save(r);}
 @PatchMapping("/{id}/cancel") public ServiceRequest cancel(@PathVariable Long id){var r=service.find(id);r.setStatus("CANCELLED");return service.save(r);}
}
