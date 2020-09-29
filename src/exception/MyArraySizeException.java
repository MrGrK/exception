package exception;

public class MyArraySizeException extends IndexOutOfBoundsException{

    private int rowsCnt;

    private int columnCnt;

    public MyArraySizeException(int rowsCnt){
        this.rowsCnt=rowsCnt;
    }
    public MyArraySizeException(int rowsCnt, int columnCnt){
        this.rowsCnt=rowsCnt;
        this.columnCnt = columnCnt;
    }

    public int getRowsCnt() {
        return rowsCnt;
    }

    public int getColumnCnt() {
        return columnCnt;
    }
}
