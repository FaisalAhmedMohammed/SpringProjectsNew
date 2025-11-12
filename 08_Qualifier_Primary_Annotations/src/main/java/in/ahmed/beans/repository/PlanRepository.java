package in.ahmed.beans.repository;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import in.ahmed.beans.Model.Plan;

@Repository
public class PlanRepository {

	@Autowired()
	@Qualifier(value="hashMap2")
	HashMap<String, Plan> hashMap;

	public Plan findBtId(String planid) {
		return hashMap.get(planid);
	}

	public HashMap<String, Plan> findAll() {
		return hashMap;
	}

}
