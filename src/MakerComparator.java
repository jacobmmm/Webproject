import java.util.*;

public class MakerComparator implements Comparator {

public int compare(Object o1,Object o2)
{
	Cars c1=(Cars)o1;
	Cars c2=(Cars)o2;
	return c1.maker.compareToIgnoreCase(c2.maker);
}
	
}
