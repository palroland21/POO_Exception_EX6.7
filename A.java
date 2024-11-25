public class A {
    private String[] array = new String[5];

    public A() {
    };

    public String getArrayByIndex() throws MyException{
        try {
            return array[10];
        }catch(IndexOutOfBoundsException e){
            throw new MyException("Exceptia mea!");
        }
    }
}
