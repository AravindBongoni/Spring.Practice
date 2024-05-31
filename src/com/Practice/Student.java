package com.Practice;

public class Student {
int id;
String name;
int attendnece;
Float marks;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAttendnece() {
	return attendnece;
}
public void setAttendnece(int attendnece) {
	this.attendnece = attendnece;
}
public Float getMarks() {
	return marks;
}
public void setMarks(Float marks) {
	this.marks = marks;
}
//public Student(int id, String name, int attendnece, Float marks) {
//	
//	this.id = id;
//	this.name = name;
//	this.attendnece = attendnece;
//	this.marks = marks;
//}
//public Student() {
//	
//}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", attendnece=" + attendnece + ", marks=" + marks + "]";
}

}
