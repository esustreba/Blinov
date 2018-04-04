package chapt03;

public class Runner {
	public static void main(String[] args) {
		
		Mark<Double> md = new Mark<Double>(71.4D);
		System.out.println(md.sameAny(md));
		Mark<Integer> mi = new Mark<Integer>(71);
		System.out.println(mi.sameAny(mi));
		System.out.println(md.roundMark());
		
		//параметризация типом Integer.
		Optional<Integer> ob1 = new Optional<>();
		ob1.setValue(1);
		
		int v1 = ob1.getValue();
		System.out.println(v1);
		
		//параметризация типом String.
		Optional<String> ob2 = new Optional<>("Java");
		String v2 = ob2.getValue();
		System.out.println(v2);
		
		//параматризация по умолчанию Object.
		Optional ob3 = new Optional();
		System.out.println(ob3.getValue());
		ob3.setValue("Java SE 8");
		System.out.println(ob3.toString()); //Выводится тип объекта, а не параметризации.
		ob3.setValue(71);
		System.out.println(ob3.toString());
		ob3.setValue(null);
		
		
	}

}
