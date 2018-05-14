import java.util.Arrays;

public class CustomStack <T> {

    private int maxSize;
    private Object [] stackArray;
    private int occupiedIndex = 0;

    public CustomStack(int maxSize) {
        this.stackArray = new Object[maxSize];
        this.maxSize = maxSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void push(T data){
        if(occupiedIndex < maxSize) {
            this.stackArray[occupiedIndex] = data;
            occupiedIndex++;
        }else{
            throw new NullPointerException();
        }

    }

    public void pop(){

    }

    public void peak(){

    }

    public int getLeftSpace(){
        return this.maxSize - this.stackArray.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(stackArray);
    }
}
