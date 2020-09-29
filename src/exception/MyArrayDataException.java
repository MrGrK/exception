package exception;

public class MyArrayDataException extends ClassCastException{

    private String data;

    private int indexX;

    private int indexY;

    public MyArrayDataException(String data, int indexX, int indexY){
        this.data = data;
        this.indexX = indexX;
        this.indexY = indexY;
    }

    public String getData() {
        return data;
    }

    public int getIndexX() {
        return indexX;
    }

    public int getIndexY() {
        return indexY;
    }
}
