package java12_9_16;

import java.util.*;

public class Main_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> stringArrayList1 = new ArrayList<>();
        stringArrayList1.add("George");
        stringArrayList1.add("Jim");
        stringArrayList1.add("John");
        stringArrayList1.add("Blake");
        stringArrayList1.add("Kevin");
        stringArrayList1.add("Mechael");
        Set<String> stringArrayList2 = new HashSet<>();
        stringArrayList2.add("George");
        stringArrayList2.add("Katie");
        stringArrayList2.add("Kevin");
        stringArrayList2.add("Michelle");
        stringArrayList2.add("Ryan");

        ArrayList<String> t1 = new ArrayList<>();
        t1.addAll(stringArrayList1);
        ArrayList<String> t2 = new ArrayList<>();
        t2.addAll(stringArrayList2);

        ArrayList<String> t3 = new ArrayList<>();
        t3.addAll(t1);
        t3.addAll(t2);
        System.out.println("s1 + s2 = " + t3);

        ArrayList<String> t4 = new ArrayList<>();
        t4.addAll(t1);
        t4.removeAll(t2);
        System.out.println("s1 - s2 = " + t4);

        ArrayList<String> t5 = new ArrayList<>();
        t5.addAll(t2);
        t5.removeAll(t1);
        System.out.println("s2 - s1 = " + t5);

        t3.removeAll(t4);
        t3.removeAll(t5);
        System.out.println(t3);

		
	}

}
