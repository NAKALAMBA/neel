

package Generics ;



class GenericsClass<T> {              // create a Generic class
        private T data;                             // variable of T type
        public GenericsClass(T data) {     // constructor of Generic class
        this.data = data;
        }
        public T getData() {                    // method that return T type variable
            return this.data;
        }
    }
    
    class Main {
    public static void main(String[] args) {
    GenericsClass<Integer> intObj = new GenericsClass<>(5);         
     // initialize generic class with Integer data
    System.out.println("Generic Class returns: " + intObj.getData());
    
    GenericsClass<String> stringObj = new GenericsClass<>("Java Programming");
     // initialize generic class with String data
        System.out.println("Generic Class returns: " + stringObj.getData());
    } 
}