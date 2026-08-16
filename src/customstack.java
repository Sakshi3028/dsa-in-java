public class customstack {
    protected int[] data;
    public static final int DEFAULT_SIZE=(10);

    int ptr=-1;

    public customstack(){
        this(DEFAULT_SIZE);
    }
    public customstack(int size){
     this.data=new int[size];
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("cannot pop from an empty stack!");
        }
        // int remove = data[ptr];
        // ptr--;
        // return removed
        // ;
        return data[ptr--];
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("cannot peek from an empty stack");
        }
        return data[ptr];
    } 
    private boolean isFull(){
        return ptr==data.length-1;
    }
     private boolean isEmpty(){
        return ptr==-1;
    }
}
