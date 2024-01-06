
package lab.viiew;
import lab.common.Library;
import lab.controller.Controller;
import lab.model.Model;

public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Library library = new Library();
        Model model = new Model();
        model.setSize_array(library.getInt("Enter number of array: ", 1, 100));
        model.setArray(library.creatArray(model.size_array));
         new Controller(model).run();
    }
    
}
