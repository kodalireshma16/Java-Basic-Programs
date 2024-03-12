public class BasicPrograms {

    //reverse array printing
    public void reverseArray(){
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Reverse Array");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    //Checking number is palindrome or not
    public void numberPalindrome(){
        int num = 12321, sum = 0;
        int reverse = num;
        while (num != 0) {
            sum = sum * 10 + num % 10;
            num = num / 10;
        }
        if (reverse == sum)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not Palindrome");
    }

    //Checking string is palindrome
    public void stringPalindrome() {
        String str = "aabaa", str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 += str.charAt(i);
        }
        if (str1.equals(str))
            System.out.println("String is Palindrome");
        else
            System.out.println("String is not Palindrome");
    }


    public static void main(String[] args) {
       BasicPrograms b=new BasicPrograms();
        b.reverseArray();
        b.numberPalindrome();
        b.stringPalindrome();
    }

}
