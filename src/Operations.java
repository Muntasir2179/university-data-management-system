public interface Operations {

	public void add(Object obj);

	public void edit(Object obj);

	public Object delete(String id);

	public Object search(String id);

	public String getDateInStringFormat(String readDate);
}
