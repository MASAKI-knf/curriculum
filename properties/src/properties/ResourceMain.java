package properties;

import java.util.ResourceBundle;
 
public class ResourceMain {
 
 public static void main(String args[]) {
 ResourceBundle bundle = ResourceBundle.getBundle("test");
 String value = bundle.getString("name");
 System.out.println(value);
 }
}
