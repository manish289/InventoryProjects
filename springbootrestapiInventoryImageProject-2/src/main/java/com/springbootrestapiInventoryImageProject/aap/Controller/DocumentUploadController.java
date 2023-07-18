package com.springbootrestapiInventoryImageProject.aap.Controller;

import java.io.IOException;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springbootrestapiInventoryImageProject.aap.Service.DocumentUploadService;
import com.springbootrestapiInventoryImageProject.aap.model.Model;


@RestController
public class DocumentUploadController {
	
	@Autowired 
	  DocumentUploadService documentservice;
	
	@PostMapping(value="/documents", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	  public List<Model> UploadDocuments(@RequestPart(value="productId",required=true) String file1, @RequestPart(value="ProductImage",required=true) MultipartFile file2) throws Exception
	  {
		  
		  ObjectMapper om= new ObjectMapper();
		       Model mod= om.readValue(file1, Model.class);
		       
		       Model mode= new Model();
		           mode.setProductId(mod.getProductId());
		           mode.setProductImage(file2.getBytes());
		           
		          List<Model> list= documentservice.saveDocuments(mode);
		           
		   return list;
	  }
	   
	
	@GetMapping("/GetallDoc")
	 public List<Model> getAllDoc()
	 { 
		List<Model> list= documentservice.getAllDoc();
		  return list;
	 }
	
}
