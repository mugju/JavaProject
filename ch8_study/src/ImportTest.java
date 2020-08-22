import static java.lang.System.out;
import static db.jdbcUtil.*;
public class ImportTest{
	public static void main(String args[]){
		out.println("static import test");
		connect();
		disconnect();
	}
}