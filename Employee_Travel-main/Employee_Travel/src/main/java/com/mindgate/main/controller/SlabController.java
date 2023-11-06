package com.mindgate.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.domain.Slab;
import com.mindgate.main.service.SlabServiceInterface;

@RestController
@RequestMapping("slabapi")
public class SlabController {
	
	@Autowired
	private SlabServiceInterface slabServiceInterface;
	
	@RequestMapping(value="slab", method = RequestMethod.GET)
	public List<Slab> getAllSlab(){
		return slabServiceInterface.getAllSlab();
	}
	
	
	@RequestMapping(value="slab/add",method = RequestMethod.POST)
	public boolean addNewSlab(@RequestBody Slab slab) {
		return slabServiceInterface.addNewSlab(slab);
	}
	
	@RequestMapping(value="slab/update", method = RequestMethod.PUT)
	public Slab updateSlab(@RequestBody Slab slab) {
		return slabServiceInterface.updateSlab(slab);
		
	}
	
	@RequestMapping(value="slab/{slabId}", method = RequestMethod.GET)
	public Slab getOneSlab(@PathVariable int slabId){
		return slabServiceInterface.getSlabBySlabId(slabId);
	}
	
	@RequestMapping(value="slab/{slabId}", method = RequestMethod.DELETE)
	public boolean deleteSlab(@PathVariable int slabId){
		return slabServiceInterface.deleteSlab(slabId);
	}
	
	

}
