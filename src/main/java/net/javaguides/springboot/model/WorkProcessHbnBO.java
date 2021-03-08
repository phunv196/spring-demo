package net.javaguides.springboot.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "work_process")
@Data
public class WorkProcessHbnBO {

	@Id
	@Column(name = "work_process_id")
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long workProcessId;
	
	@Column(name = "employee_id")
	  private Long employeeId;
	
	@Column(name = "work_process_name")
	  private String workProcessName;
	
	@Column(name = "start_date")
	  private Date startDate;
	
	@Column(name = "end_date")
	  private Date endDate;
}

