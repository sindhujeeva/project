package com.mindgate.main.repository;

import java.util.List;

import com.mindgate.main.domain.Travel_Requests;

public interface TravelRequestRepositoryInterface {

	public boolean createNewTravelRequest(Travel_Requests travel_Requests);
	public Travel_Requests updateTravelRequest(Travel_Requests travel_Requests);
	public Travel_Requests getTravelRequestById(int travelRequestId);
	public List<Travel_Requests> getAllTravelRequests();
	public boolean deleteTravelRequestById(int travelRequestId);
	
	public Travel_Requests updateRequest(Travel_Requests travel_Requests);
}
