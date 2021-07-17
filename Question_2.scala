object Question_2{
   def prime(n:Int,i:Int=2):Boolean= n match{
        case n if(n==2) => true
        case n if(n < 2) => false
        case n if(n%i==0) => false
        case n if(i*i>n) => true
        case _ => prime(n,i+1) 
    }
     def primeSeq(n:Int,i:Int=0):Unit ={
        if(i<=n){
            if(prime(i)==true){
                  println(i);  
            }
          primeSeq(n,i+1); 
            
        }
    }
       def main(args:Array[String]):Unit={
        println(primeSeq(10););
    }
}