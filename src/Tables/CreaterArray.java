package Tables;

import java.util.Random;

public class CreaterArray {
    int min;
    int max;
    int size;

    public CreaterArray(int min, int max, int size) {
        this.min = min;
        this.max = max;
        this.size = size;
    }

    public int [] CreationArray (){
        Random los = new Random();
        int [] Array = new int [size];
        for (int i = 0; i < size; i++){
            Array[i] = los.nextInt(max-min+1)+min;
        }
        return Array;
    }
}
