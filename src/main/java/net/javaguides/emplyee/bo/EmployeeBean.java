package net.javaguides.emplyee.bo;

import lombok.Value;


public class EmployeeBean {
	private Long employeeId;

	private String employeeCode;

	private String fullName;

	private Long gender;

	private String nationality;

	private String address;

	private Long phoneNumber;

	private String description;

	private String educationName;

	private String hospitalName;

	private String specializedName;

	private String wordProcessName;

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Long getGender() {
		return gender;
	}

	public void setGender(Long gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getEducationName() {
		return educationName;
	}

	public void setEducationName(String educationName) {
		this.educationName = educationName;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getSpecializedName() {
		return specializedName;
	}

	public void setSpecializedName(String specializedName) {
		this.specializedName = specializedName;
	}

	public String getWordProcessName() {
		return wordProcessName;
	}

	public void setWordProcessName(String wordProcessName) {
		this.wordProcessName = wordProcessName;
	}
}
