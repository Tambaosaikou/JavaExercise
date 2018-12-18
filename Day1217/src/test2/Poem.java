/**
 * 诗词：Poem
     名字
     作者
     朝代
     内容
 */
package test2;

public class Poem {
//	private String name;
	private String author;
	private String dynasty;
	private String body;
@Override
	public String toString() {
		return "作者=" + author + "\n朝代=" + dynasty + "\n内容=" + body;
	}
	//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDynasty() {
		return dynasty;
	}
	public void setDynasty(String dynasty) {
		this.dynasty = dynasty;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Poem(String author, String dynasty, String body) {
		super();
//		this.name = name;
		this.author = author;
		this.dynasty = dynasty;
		this.body = body;
	}
	public Poem() {
		super();
		// TODO Auto-generated constructor stub
	}

}
