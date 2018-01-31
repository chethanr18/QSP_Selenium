import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ListBoxQuestions {

	static{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Chethan%20DOCS/QSP/HandlingDropdown.html");
		
		WebElement listBox = driver.findElement(By.id("slv"));
		Select select = new Select(listBox);
		List<WebElement> allOptions = select.getOptions();
		
		
		/*** Content of ListBOx in Sorted order without duplicates***/
		Set<String> allList = new TreeSet<String>();
		for(WebElement ele : allOptions){
			allList.add(ele.getText());
		}
		System.out.println(allList);
		
		//Collections.sort(allList);
		
		/** Check if ListBox has duplicate options & also print the duplicates **/
		
		//TODO:
		/*Method1:Create an ArrayList<String> for all the Options
				Add the ArrayList to a Set.
				While adding if any of the statment returns false, then that element is duplicate and hence add it to another set */
		
		/*Method2: Sort the ArrayList
		 			in a for loop, if i === i+1 then duplicate.
		 */
			
		/** Check if ListBox content is already in sorted order **/
		
		/** Check if specified option is present in the list box **/
		
		/** Check if specified option is duplicate in the listbox **/
		
	}

}
