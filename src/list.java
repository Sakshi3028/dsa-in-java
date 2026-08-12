
public class list {

    private node head;
    private node tail;
    private int size;
    public list(){
        this.size=0;
    }
    //insert firset value
    public void insertFirst(int val){
        node Node=new node(val);
          Node.next=head;
          head=Node;
          if(tail==null){
            tail=head;
          }
          size+=1;
    }
//last value insert
    public void insertlast(int val){
        if(tail==null){
            insertFirst(val);
        }
        node Node=new node(val);
        tail.next=Node;
        tail=Node;
        size++;
    }
//insert at nth index
    public void insert(int val,int index){
     if (index==0){
        insertFirst(val);
        return;
     }
     if(index==size){
        insertlast(val);
            return;
        
     }
     node temp=head;
     for(int i=1;i<index;i++){
        temp=temp.next;
     }
     node Node=new node(val,temp.next);
     temp.next=Node;
     size++;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        node secondLast = get(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        return val;
    }
     public node find(int val){
        node Node=head;
        while(Node!=null){
            if(Node.value==val){
              return Node;
            }
            Node=Node.next;
        }
        return null; 
    }
     public node get(int index){
        node Node=head;
        for(int i=0;i<=index;i++){
            Node=Node.next;
        }
        return Node; 
    }

    //delete value
    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
              tail=null;
        }
        size--;
      return val;
    }

   
    public void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
System.out.println("END");
    }
    private class node{
       private int value;
         private node next;

         public node(int value){
            this.value=value;
         }
         public node(int value,node next){
            this.value=value;
            this.next=next;
         }
    }

}
