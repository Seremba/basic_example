package org.openmrs.module.department.api.dao;

import java.util.List;

import org.openmrs.module.department.Department;

/**
 * Database methods for {@Link DepartmentService}
 */
public interface DepartmentDAO {
	
	/**
	 * @see org.openmrs.module.department.api.departmentService
	 */
	List<Department> getAllDepartments();
	
	/**
	 * @see org.openmrs.module.department.api.DepartmentService#getDepartment(java.lang.Integer)
	 */
	Department getDepartment(Integer id);
	
	/**
	 * @see org.openmrs.module.department.api.DepartmentService#saveDepartment(org.openmrs.module.department.Department)
	 */
	Department saveDepartment(Department department);
	
	/**
	 * @see org.openmrs.module.department.api.DepartmentService#purgeDepartment(org.openmrs.module.department.Department)
	 */
	void purgeDepartment(Department department);
	
}
