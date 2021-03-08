package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeHbnBO {
	@Id
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employeeId;

	@Column(name = "employee_code")
	private String employeeCode;

	@Column(name = "full_name")
	private String fullName;

	@Column(name = "gender")
	private Long gender;

	@Column(name = "nationality")
	private String nationality;

	@Column(name = "address")
	private String address;

	@Column(name = "phone_number")
	private Long phoneNumber;

	@Column(name = "description")
	private String description;

	@Column(name = "education_id")
	private String educationId;

	@Column(name = "hospitals_id")
	private String hospitalsId;

	@Column(name = "specialized_id")
	private String specializedId;

	@Column(name = "attachment_file_id")
	private String attachmentFileId;

}
