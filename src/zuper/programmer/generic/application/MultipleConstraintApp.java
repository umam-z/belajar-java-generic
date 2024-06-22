package zuper.programmer.generic.application;

public class MultipleConstraintApp {
    public static void main(String[] args) {
        // Data<Manager> manager = new Data<>(new Manager());
        Data<VisePresident> visePresident = new Data<>(new VisePresident());
    }

    public static interface CanSayHello {
        void sayHello(String name);
    }

    public static abstract class Employee {
    
    }

    public static class Manager extends Employee {
        
    }

    public static class VisePresident extends Employee implements CanSayHello {

        @Override
        public void sayHello(String name) {
            System.out.println("Hello : " + name);
        }
        
    }

    public static class Data<T extends Employee & CanSayHello> {
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
        
    }
}