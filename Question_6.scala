object Question_6 extend App{
     def fibonacci(n:Int):Int={
        if( n<=1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2)
    }
    def display_fibonacci(n:Int){
       
        for(i<- 1 to n){
            println(fibonacci(i))
        }
       
    }

    def main(args:Array[String]):Unit={
        display_fibonacci(9);
    }
}