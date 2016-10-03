
public class Cars implements Comparable<Cars> {
String maker;
String model;
String year;
public Cars(String mak, String mdl, String yr)
{
	maker=mak;
	model=mdl;
	year=yr;
}
public int compareTo(Cars c)
{
if(model.equals(c.model))
{
	return 0;
}
else if(model.compareToIgnoreCase(c.model)>0)
{
	return 1;
}
else
	return -1;
}
}
