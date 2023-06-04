
package Model;

public class CapacityException extends Exception{
    @Override
    public String getMessage(){
        return "Number of rows and column must be equal";
    }
}
