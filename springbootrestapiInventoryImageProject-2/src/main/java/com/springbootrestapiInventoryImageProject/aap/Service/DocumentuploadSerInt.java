package com.springbootrestapiInventoryImageProject.aap.Service;

import java.util.List;

import com.springbootrestapiInventoryImageProject.aap.model.Model;

public interface DocumentuploadSerInt {

	public List<Model> saveDocuments(Model mode) ;

	List<Model> getAllDoc();
}
