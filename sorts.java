class sorts{
    public static void main(int[] a){
        if (a.length == 0){
            int c = utl.askInt("How big of a random array?");
            int[] d = new int[c];
            utl.random(d, 0 , 100);
            a = d;
        }
        utl.printArr(a);
        while (true){
            String sort = utl.ask("What function to the array?").toLowerCase();
            if (sort.equals("bubble")){
                bubbleInc(a);
                utl.printArr(a);
            } else if(sort.equals("selection")){
                selectionInc(a);
                utl.printArr(a);
            } else if (sort.equals("count")){
                int b = utl.askInt("Search for what number?");
                count(a, b);
            } else if (sort.equals("max")){
                System.out.println("Max: " + max(a));
            } else if (sort.equals("min")){
                System.out.println("Min: " + min(a));
            } else if (sort.equals("shuffle")){
                shuffle(a);
                utl.printArr(a);
            }
        }
    }
    
    static private void shuffle(int[] a){
        for (int i = 0; i < a.length*10; i++){
            swap(a, (int)(Math.random()*a.length), (int)(Math.random()*a.length));
        }
    }
    
    static private void count(int[] a, int b){
        int count = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] == b){
                count++;
                System.out.println(b + " is at location " + i); 
            }
        }
        System.out.println("number of " + b + "'s: " + count);
    }
    
    static private void bubbleInc(int[] a){
        int swaps = 1;
        while(swaps != 0){
            swaps = 0;
            for (int i = 0; i < a.length-1; i++){
                if (a[i] > a[i+1]){
                    swap(a, i, i+1);
                    swaps++;
                }
            }
        }

    }
    
    static private void bubbleDec(int[] a){
        int swaps = 1;
        while(swaps != 0){
            swaps = 0;
            for (int i = 0; i < a.length-1; i++){
                if (a[i] < a[i+1]){
                    swap(a, i, i+1);
                    swaps++;
                }
            }
        }
    }
        
    private static void swap(int[] a, int b, int c){
        int d = a[c];
        a[c] = a[b];
        a[b] = d;
    }
    
    static private void selectionInc(int[] a){
        for (int j = 0; j < a.length; j++){
            int smallest = a[j];
            int loc = j;
            for (int i = j+1; i < a.length; i++){
                if (smallest > a[i]){
                    smallest = a[i];
                    loc = i;
                }
            }
            swap(a, j, loc);
        }
    }
    
    static private void selectionDec(int[] a){
        for (int j = 0; j < a.length; j++){
            int largest = a[j];
            int loc = j;
            for (int i = j+1; i < a.length; i++){
                if (largest < a[i]){
                    largest = a[i];
                    loc = i;
                }
            }
            swap(a, j, loc);
        }
    }
    
    private static int min(int[] a){
        int temp = a[0];
        for (int i = 1;i<a.length;i++){
            if (temp>a[i])
                temp = a[i];
        }
        return temp;
    }
    
    private static int max(int[] a){
        int temp = a[0];
        for (int i = 1;i<a.length;i++){
            if (temp<a[i])
                temp = a[i];
        }
        return temp;
    }
    
    private static int sum(int[] a){
        return a[0] + sum(a, 1);
    }
    
    private static int sum(int[] a, int start){
        if (a.length!=start)
            return a[start] + sum(a, start+1);
        return 0;
    }
}