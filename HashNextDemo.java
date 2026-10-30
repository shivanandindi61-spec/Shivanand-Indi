
	package Project;
	import java.util.ArrayList;
	import java.util.Iterator;

	public class HashNextDemo {
		public static void main(String[]args) {
			ArrayList<String>names=new ArrayList<>();
			names.add("Asha");
			names.add("Rahul");
			Iterator<String>it=names.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}

	}



