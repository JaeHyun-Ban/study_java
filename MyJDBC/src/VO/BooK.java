package VO;

public class BooK {
	
	private int id;
	private String name;
	private String writer;

	public BooK() {
	}

	public BooK(int id, String name, String writer) {
		this.id = id;
		this.name = name;
		this.writer = writer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
}
