package org.openmrs.module.department.api;

import java.util.List;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.department.Department;
import org.springframework.transaction.annotation.Transactional;

/**
 * The service for managing department
 * 
 * @author seremba
 */
@Transactional
public interface DepartmentService extends OpenmrsService {
	
	/**
	 * Get a list of departments
	 * 
	 * @return list of department
	 */
	@Transactional(readOnly = true)
	List<Department> getAllDepartments();
	
	/**
	 * Gets a department for a given id.
	 * 
	 * @param id the department id
	 * @return the department with the given id
	 */
	@Transactional(readOnly = true)
	Department getDepartment(Integer departmentId);
	
	/**
	 * Saves a new or existing department.
	 * 
	 * @param department the department to save.
	 * @return the saved department.
	 */
	Department saveDepartment(Department department);
	
	/**
	 * Deletes a department from the database.
	 * 
	 * @param department the department to delete.
	 */
	void deleteDepartment(Department department);
}
