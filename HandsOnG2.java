public class HandsOnG2 {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();
        Integer obj = 10;
        String obj2 = "Hello World";

        integerBox.add(obj);
        stringBox.add(obj2);

        System.out.printf("Integer Value :%d\n\n", integerBox.get( ));
 System.out.printf("String Value :%s\n", stringBox.get( ));
    }
}

class Box<T>{
    private T ref;
    public void add(T newRef){
        ref = newRef;
    }

    public T get(){
        return ref;
    }
}
