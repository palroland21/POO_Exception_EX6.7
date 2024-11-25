public class C extends B{
    private String[] array = new String[5];

    public C() {
    };

    @Override
    public String getArrayByIndex() throws MyExceptionNR3{
        try {
            return array[10];
        }catch(IndexOutOfBoundsException e){
            throw new MyExceptionNR3("Exceptia mea numarul 3!");
        }
    }
}
