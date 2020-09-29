package exception;

public class Main {
    public static void main(String[] args) {
        String[][] xArr= {{"1", "1", "1", "1"},
                          {"1", "1", "1", "1"},
                          {"1", "1", "1", "1"},
                          {"1", "1", "1", "1"}};
        try{
            System.out.println("Результат: " + arraySum(xArr));
        }catch (MyArrayDataException e){
            System.out.println("Ошибка данных массива; Значение: "+ e.getData()+"; Ячейка: ["+e.getIndexX()+"]"+"["+e.getIndexY()+"];");
        }catch (MyArraySizeException e){
            if(e.getColumnCnt()==0)
                System.out.println("Ошибка размерности массива; Количество строк: "+ e.getRowsCnt()+";");
            else {
                System.out.println("Ошибка размерности массива; В строке с индексом: "+ e.getRowsCnt()+" количество элементов: "+e.getColumnCnt());
            }
        }
    }

    public static int arraySum(String[][] arr){
        if(arr.length!=4){
            throw new MyArraySizeException(arr.length);
        }
        for (int i=0;i< arr.length; i++) {
                if(arr[i].length!=4){
                throw new MyArraySizeException(i, arr[i].length);
            }
        }
        int result=0;
        for (int i=0;i< arr.length; i++) {
            for (int j=0; j< arr[i].length; j++) {
                try{
                    result +=Integer.parseInt(arr[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException(arr[i][j],i, j );
                }
            }
        }
        return result;
    }
}

