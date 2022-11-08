package Sep24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortinList implements Comparator{
    public static void main(String[] args) {
		//Sorting an array
    	int [] arr= {1,4,3,6,7};
    	Arrays.sort(arr);
    	for(int i:arr) {
    		System.out.println(i);
    	}
    	//ArrayList Sorting
    	List<Integer> al= new ArrayList<>();
    	al.add(46);
    	al.add(35);
    	al.add(56);
    	al.add(14);
    	Collections.sort(al);
    	System.out.println("Sorted List: "+al);
    	
    	//Student class as Wrapper class
    	Student s1=new Student(95,"Ram",1);
    	Student s2=new Student(96,"Sam",2);
    	Student s3=new Student(97,"Shyam",3);
    	Student s4=new Student(98,"Aditya",4);
    	Student s5=new Student(99,"Ashutosh",5);
    	List<Student> st=new ArrayList<>();
    	st.add(s1);
    	st.add(s2);
    	st.add(s3);
    	st.add(s4);
    	st.add(s5);
    	Collections.sort(st,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.roll-o1.roll;
			}
    		
    	});
    	System.out.println(st.get(0));
    	System.out.println(st.get(1));
    	System.out.println(st.get(2));
    	System.out.println(st.get(3));
    	System.out.println(st.get(4));
    	
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
    
}

class Student{
	int marks;
	String name;
	int roll;
	Student(int marks,String name,int roll){
		this.marks=marks;
		this.name=name;
		this.roll=roll;
	}
}
