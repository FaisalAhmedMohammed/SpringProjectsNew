package in.ahmed.co.repository;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.ahmed.co.model.Plan;

@Repository
public class PlanRepository {

	@Autowired
	HashMap<String, Plan> hashmap;   // creating map object

	public Plan findById(String plainid) {  // creating a method with return type as Plan Object
		if (hashmap != null) {   // it is used to check weather the map object is null or not
			return hashmap.get(plainid);// get() method is used to retrive the object based on the key
		}
		return null;

	}

	public HashMap<String, Plan> findAll() {
		return hashmap;
	}

}
