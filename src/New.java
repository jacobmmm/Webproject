import java.util.*;

public class New {
	public static void main(String args[]){
/*Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
hm.put(5,"Boom");
hm.put(2, "Puneeth");
hm.put(4, "Bull");
hm.put(6,"Boom");
hm.put(2,"hit");
for(Map.Entry m:hm.entrySet()){
	System.out.println(m.getKey()+""+m.getValue());
}*/
ArrayList<Cars> a1=new ArrayList<Cars>();
Cars c=new Cars("Mercedes","Eclass","2014");
Cars c1=new Cars("Audi","A6","2015");
Cars c2=new Cars("BMW","530d","2014");
Cars c3=new Cars("Toyota","Camary","2015");
Cars c5=new Cars("Toyota","Corolla","2006");
a1.add(c);
a1.add(c1);
a1.add(c2);
a1.add(c3);
a1.add(c5);
Collections.sort(a1,new MakerComparator());
Iterator i=a1.iterator();
while(i.hasNext())
{
	Cars c4=(Cars)i.next();
	System.out.println("Maker:"+""+c4.maker+"\n"+"Model:"+c4.model+"Yer"+""+c4.year);
}
}
}