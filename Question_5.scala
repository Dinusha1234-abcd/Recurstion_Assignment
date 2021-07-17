object Question_5 {
    def find_even(n:Int,i:Int=0):Unit={
        if(n>i){
            if(i%2==0){
                println(i);
            }
            find_even(n,i+1);
        }
    }
 
    def main(args:Array[String]):Unit={
        find_even(10);
    }
}