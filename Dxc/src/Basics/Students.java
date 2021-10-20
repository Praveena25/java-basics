package Basics;

public class Students {
String name;
int age;
public Students() {}
public Students(String name) {
	this.name=name;
}
public Students(String name,int age) {
	super();
	this.name=name;
	this.age=age+2;
}
static String COLLEGE_NAME = "IIT";

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}
