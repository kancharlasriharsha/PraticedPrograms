import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Listexample {
	
	public class Message {
		int i;
	}
	public class Message1 {
		int i;
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(); 
		
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		m.put(0, 1);
		
		m.put(0, 2);
		
		System.out.println(m);
		
		System.out.println("*********************");
		
		list.add(1);
		
		list.get(0);
		System.out.println(list);
		ArrayList<Integer> list1 = (ArrayList<Integer>)list.clone();
		System.out.println(list1);
		
		System.out.println("*********************");
		
		//ArrayList<Integer> list = new ArrayList<>();  
		Listexample.Message lm = new Listexample().new Message();
		Listexample.Message1 lmm = new Listexample().new Message1();
		 List<Object> l = new ArrayList<>();
		 l.add(lm);
		 l.add(lmm);
		// if(lm == lmm)
        System.out.println(lm.equals(lmm));
        System.out.println(l.size());
  
//        Iterator<Integer> it = list.iterator();  
//        while (it.hasNext()) {                   
//Integer value = it.next();              
//            System.out.println("List Value:" + value);  
//           // if (value.equals(3))  
//                //list.remove(value);  
//        }  
	}

}
