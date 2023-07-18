package com.springbootrestapiInventoryImageProject.aap.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootrestapiInventoryImageProject.aap.Dao.DocumetDaoImpl;
import com.springbootrestapiInventoryImageProject.aap.model.Model;


@Service
public class DocumentUploadService implements DocumentuploadSerInt {

	@Autowired
	DocumetDaoImpl docdaorep;

	public List<Model> saveDocuments(Model mode) {
	
		docdaorep.save(mode);
		List<Model> list= docdaorep.findAll();
		return list;
	}

	@Override
	public List<Model> getAllDoc() {
		
		return docdaorep.findAll();
	}
	
	
	

}
