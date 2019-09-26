public class Main11 {
    public static void main(String[] args) {

    }

    public void publicMethod(){

    }

    private void privateMethod(){

    }

    class NestedClass{
        public void nestedPublic(){
            privateMethod();
        }
    }
}
