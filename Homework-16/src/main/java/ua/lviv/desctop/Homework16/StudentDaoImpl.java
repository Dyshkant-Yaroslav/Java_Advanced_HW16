package ua.lviv.desctop.Homework16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StudentDaoImpl implements StudentDAO {

	List<Student> list = new ArrayList<>();

	@Override
	public Student create(Student o) {
		list.add(o);
		return o;
	}

	@Override
	public Student read(Integer index) {
		return list.get(index);
	}

	@Override
	public Student update(Integer index, Student o) {
		list.set(index, o);
		return o;
	}

	@Override
	public void delete(Integer id) {
		Iterator<Student> iterator = list.iterator();
		while(iterator.hasNext()) {
			Student st = iterator.next();
			if(st.getId()==id) {
				iterator.remove();
			}
		}
		
		
	}

	@Override
	public void readAll() {
		System.out.println(Arrays.asList(list));
		
	}
	


}
