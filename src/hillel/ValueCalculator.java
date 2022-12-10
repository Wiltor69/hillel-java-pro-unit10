package hillel;



public class ValueCalculator extends Thread{


    public ValueCalculator(String name) {
        super(name);
    }

    @Override
    public void run() {
        int [] array = new int[1000000];


        long start = System.currentTimeMillis();
        System.out.println(getName() + " begin: " + start);


        for (int i =0; i < array.length; i++){
            array[i] = 3;
        }

        int n = array.length;

        int [] a = new int [(n + 1)/2];
        int [] b = new int [n - a.length];

        System.arraycopy(array, 0, a, 0, a.length);
        System.arraycopy(array, a.length, b, 0, b.length);

        float ft =0;

        for (int i = 0; i < a.length; i++) {
            ft =  (float)(a[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            a[i] = (int) ft;

        }
        array = new int[a.length + b.length];

        System.arraycopy(a, 0, array, 0, a.length);
        System.arraycopy(b, 0, array, a.length, b.length);

    }

}
