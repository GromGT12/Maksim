package home_work_8.Task2;

class StringPalindrome {
    public static void main(String[] args){
        String myString = "алла";
        StringBuilder buffer = new StringBuilder(myString);
        buffer.reverse();
        String data = buffer.toString();
        if(myString.equals(data)){
            System.out.println("Given String is palindrome");
        }else{
            System.out.println("Given String is not palindrome");
        }
    }
}


