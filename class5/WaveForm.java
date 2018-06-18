class WaveForm{
    void swap(int array[], int n, int m){
        int temp = array[n];
        array[n] = array[m];
        array[m] = temp;
    }
    void sortInWave(int array[], int a){
        for (int i = 0; i<a; i+=2) {
       
        if (i>0 && array[i-1] > array[i] )
                swap(array, i-1, i);
            if (i<a-1 && array[i] < array[i+1] )
                swap(array, i, i + 1);
        }
    }
    public static void main(String args[]){
        WaveForm ob = new WaveForm();
        int array[] = {20,10,8,6,4,2};
        int a = array.length;
        ob.sortInWave(array, a);
        for (int i : array)
            System.out.print(i+" ");
    }
}