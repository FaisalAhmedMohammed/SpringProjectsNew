package in.ahmed.beans.repository;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.ahmed.beans.Model.Plan;

@Repository
public class PlanRepository {

	@Autowired
	HashMap<String, Plan> hashMap1; 

	public Plan findBtId(String planid) {
		return hashMap1.get(planid);
	}

	public HashMap<String, Plan> findAll() {
		return hashMap1;
	}

}
