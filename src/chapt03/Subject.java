package chapt03;

public class Subject<T1, T2> {
	private T1 name;
	private T2 id;
	
	public Subject() {		
	}
	
	public Subject(T2 ids, T1 names) {
		id = ids;
		name = names;
	}

}
