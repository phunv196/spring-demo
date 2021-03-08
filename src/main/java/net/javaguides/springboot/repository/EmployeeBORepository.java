
package net.javaguides.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.javaguides.emplyee.bo.EmployeeBean;
import net.javaguides.springboot.model.EmployeeHbnBO;
@Transactional
@Repository
public interface EmployeeBORepository extends CrudRepository<EmployeeHbnBO, Long> {
	public static final String emp = "select e.employee_id as employeeId," 
									+ "	e.employee_code as employeeCode,"
									+ " e.full_name as fullName ,"
									+ " e.gender as gender , "
									+ " e.address as address, "
									+ " e.phone_number as phoneNumber, "
									+ " e.nationality as nationality, "
									+ " e.description as description, "
									+ " edu.education_name as educationName, "
									+ " h.hospital_name as hospitalName, "
									+ " s.specialized_name as specializedName,"
									+ " p.potision_name as potisionName"
									+ "	 from employee e "
									+ " left join education edu on edu.education_id = e.education_id "
									+ " left join hospitals h on h.hospital_id = e.hospitals_id "
									+ " left join specialized s on s.specialized_id = e.specialized_id"
									+ " left join potision p on p.potision_id = e.potision_id";
	
	public static final String e = "select full_name from employee";
	@Query(nativeQuery = true ,value = emp)
	List<EmployeeBean> getEmp();

}