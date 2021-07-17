object Question_4{
     def iseven(n:Int):Boolean={
        if(n==0){
            return true;
        }else if(n==1){
            return false;
        }else{
            val Temp = num -2;
            if( iseven(Temp)){
                return true;
            }else{
                return false;
            }
        }
    }

    def main(args:Array[String]):Unit={
        println(iseven(10));
    }

}