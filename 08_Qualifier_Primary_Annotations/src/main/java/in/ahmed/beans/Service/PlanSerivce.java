package in.ahmed.beans.Service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ahmed.beans.Model.Plan;
import in.ahmed.beans.repository.PlanRepository;

@Service
public class PlanSerivce {

	@Autowired
	PlanRepository planRepository;

	public Plan getById(String planid) {
		return planRepository.findBtId(planid);
	}

	public HashMap<String, Plan> getAll() {
		return planRepository.findAll();
	}

}
