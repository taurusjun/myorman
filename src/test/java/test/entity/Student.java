package test.entity;

import java.util.Date;

import org.orman.mapper.Model;
import org.orman.mapper.annotation.Entity;
import org.orman.mapper.annotation.PrimaryKey;

@Entity
class Student extends Model<Student> {
	@PrimaryKey(autoIncrement = true)
	public int id;
	public String name;

	public Date registrationDate;
	public float gpa;

	public Student() {

	}

}