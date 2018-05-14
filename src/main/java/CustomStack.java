import java.util.Arrays;

public class CustomStack <T> {

    private int maxSize;
    private Object [] stackArray;
    private int usedSpace = 0;
    private int [] freeIndex;

    public CustomStack(int maxSize) {
        this.stackArray = new Object[maxSize];
        this.maxSize = maxSize;
    }

    public Object[] getStackArray() {
        return stackArray;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void push(T data){
        if(usedSpace < maxSize) {
            for(int i = 0; i < maxSize; i++){
                if(this.stackArray[i] == null){
                    this.stackArray[i] = data;
                    usedSpace++;
                    break;
                }
            }
        }else{
            throw new NullPointerException();
        }

    }

    public void pop(int index){
        this.stackArray[index] = null;
        usedSpace--;

    }

    public void peak(){

    }

    public int getLeftSpace(){
        return this.maxSize - this.usedSpace;
    }

    @Override
    public String toString() {
        return Arrays.toString(stackArray);
    }
}
