package in.ahmed.co.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ahmed.co.model.Plan;
import in.ahmed.co.repository.PlanRepository;

@Service
public class PlanService {

	@Autowired
	PlanRepository planRepo;  // Dependency injection using auto wiring

	public Plan getById(String planid) {// this method is used to call repository method to retrive one plan object
		return planRepo.findById(planid);
	}

	public HashMap<String, Plan> getAll() {
		return planRepo.findAll();
	}

}
