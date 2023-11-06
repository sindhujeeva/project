package com.mindgate.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.domain.Travel_Requests;
import com.mindgate.main.repository.TravelRequestRepositoryInterface;

@Service
public class TravelRequestService implements TravelRequestServiceInterface {
	
	@Autowired
	private TravelRequestRepositoryInterface travelRequestRepository;

	@Override
	public boolean createNewTravelRequest(Travel_Requests travel_Requests) {
		return travelRequestRepository.createNewTravelRequest(travel_Requests);
	}

	@Override
	public Travel_Requests updateTravelRequest(Travel_Requests travel_Requests) {
		return travelRequestRepository.updateTravelRequest(travel_Requests);
	}

	@Override
	public Travel_Requests getTravelRequestById(int travelRequestId) {
		return travelRequestRepository.getTravelRequestById(travelRequestId);
	}

	@Override
	public List<Travel_Requests> getAllTravelRequests() {
		return travelRequestRepository.getAllTravelRequests();
	}

	@Override
	public boolean deleteTravelRequestById(int travelRequestId) {
		return travelRequestRepository.deleteTravelRequestById(travelRequestId);
	}

	@Override
	public Travel_Requests updateRequest(Travel_Requests travel_Requests) {
		return travelRequestRepository.updateRequest(travel_Requests);
	}

}
