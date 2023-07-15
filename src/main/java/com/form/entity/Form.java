package com.form.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="form_details")
public class Form {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@Column(name="first_name",length = 128, nullable = false)
		private String firstName;
		
		@Column(name="middle_name",length = 128, nullable = false)
		private String middleName ;
		
		@Column(name="last_name",length = 128, nullable = false)
		private String lastName;
		
		@Column(name="email",length = 128, nullable = false, unique = true)
		private String email;
		
		@Column(name="mobile",length = 128, nullable = false, unique = true)
		private long mobile;
		
		@Column(name="locality",length = 128, nullable = false)
		private String locality;
		
		@Column(name="city",length = 128, nullable = false)
		private String city;
		
		@Column(name="state",length = 128, nullable = false)
		private String state;
		
		@Column(name="country",length = 128, nullable = false)
		private String country;
		
		@Column(name="pin_no",length = 128, nullable = false)
		private long pinNo;
		
		@Column(name="education",length = 128, nullable = false)
		private String education;
		
		@Column(name="college",length = 128, nullable = false)
		private String college;
		
		@Column(name="gender",length = 128, nullable = false)
		private String  gender;
		
		@Column(name="religion",length = 128, nullable = false)
		private String religion;
		
		@Column(name="status",length = 128, nullable = false)
		private String status;
		
		@Column(name="gardians_name",length = 128, nullable = false)
		private String gardiansName;
		
		@Column(name="height",length = 128, nullable = false)
		private String height;
		
		@Column(name="weight",length = 128, nullable = false)
		private String weight;
		
		@Column(name="colour",length = 128, nullable = false)
		private String colour;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getMiddleName() {
			return middleName;
		}

		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public long getMobile() {
			return mobile;
		}

		public void setMobile(long mobile) {
			this.mobile = mobile;
		}

		public String getLocality() {
			return locality;
		}

		public void setLocality(String locality) {
			this.locality = locality;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public long getPinNo() {
			return pinNo;
		}

		public void setPinNo(long pinNo) {
			this.pinNo = pinNo;
		}

		public String getEducation() {
			return education;
		}

		public void setEducation(String education) {
			this.education = education;
		}

		public String getCollege() {
			return college;
		}

		public void setCollege(String college) {
			this.college = college;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getReligion() {
			return religion;
		}

		public void setReligion(String religion) {
			this.religion = religion;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getGardiansName() {
			return gardiansName;
		}

		public void setGardiansName(String gardiansName) {
			this.gardiansName = gardiansName;
		}

		public String getHeight() {
			return height;
		}

		public void setHeight(String height) {
			this.height = height;
		}

		public String getWeight() {
			return weight;
		}

		public void setWeight(String weight) {
			this.weight = weight;
		}

		public String getColour() {
			return colour;
		}

		public void setColour(String colour) {
			this.colour = colour;
		}
		
		
}
