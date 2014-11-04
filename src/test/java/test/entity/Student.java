package test.entity;

import org.orman.mapper.Model;
import org.orman.mapper.annotation.Entity;
import org.orman.mapper.annotation.PrimaryKey;

@Entity
class Student extends Model<Student> {
	@PrimaryKey(autoIncrement = true)
	public int id;
	public String name;
	// public Date registrationDate;
	// public float gpa;
}