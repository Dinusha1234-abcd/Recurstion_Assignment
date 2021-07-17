object Question_3 {
    def sum(n:Int):Int ={
        if(n<=1){
            return n;
        }else{
            
            return n+ sum(n-1);
        }
    }
    def main(args:Array[String]):Unit={
        println(sum(10));
    }
   
}