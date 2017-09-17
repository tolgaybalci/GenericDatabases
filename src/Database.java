import java.util.ArrayList;
import java.util.List;

public class Database<T> {

	T t;

	List<T> savedEntities = new ArrayList();

	private String name;
	private String descritption;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescritption() {
		return descritption;
	}

	public void setDescritption(String descritption) {
		this.descritption = descritption;
	}

	public void save(T t) {
		
	   savedEntities.add(t);
	}
	
	public void printElements() {
		
		for (T t : savedEntities) {
			
			System.out.println(t.toString());
		}
	}
}
