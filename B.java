public class B extends A{
    private String[] array = new String[5];

    public B() {
    };

    @Override
    public String getArrayByIndex() throws MyExceptionNR2{
        try {
            return array[10];
        }catch(IndexOutOfBoundsException e){
            throw new MyExceptionNR2("Exceptia mea numarul 2!");
        }
    }
}
