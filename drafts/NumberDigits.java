class NumberDigits {

    public static void main(String[] args) {

        int count = 0, num = 3452;

        //System.out.println("Num: " +num/10);
        while(num != 0)
        {
            // num = num/10
            num /= 10;
            ++count;
        }


       /*
        3452/10
        num=345
        count =1 
        345/10
        num=34
        count=2
        34/10
        num=3
        count=3
        3/10
        num=3
        count=4
        loop stops 
        */

        System.out.println("Number of digits: " + count);
    }
}