package jvm.classloader;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassClassDemo {

	public static void main(String[] args) {
		String s1=new String("abcd");
		Class c1 = s1.getClass();

		System.out.println("Class name: "+c1.getName());
		System.out.println("Class methods are as follows:");
		Method m[] = c1.getMethods();
		for (Method method:m) {
			System.out.println(method.getName());
		}
		System.out.println("Class fields are as follows:");
		Field f[] = c1.getFields();
		for (Field field:f) {
			System.out.println(field.getName());
		}
	}

}
