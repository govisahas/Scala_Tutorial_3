
//01)

object area{

    def main(args:Array[String]):Unit={
        def area(r:Int):Unit=  println(math.Pi*r*r)


      area(5)
}
}


//02)


object temp{

    def main(args:Array[String]):Unit={
        def farenConvert(celcius:Int):Unit=println(celcius*1.8 +32)
        farenConvert(35)
    }

}

//03)

object volume{
    def main(args:Array[String]):Unit ={
        def volume(r:Double):Unit={

                  println(4/3* math.Pi*r*r*r )

        }
        volume(5)
    }
}

//04)

object bookstore{
    def main(args:Array[String]):Unit={
        def totalCoverprice(copies:Int):Double=24.95*copies*0.4
        def shippingCost(copies:Int):Double= { copies*3 +(copies-50)*0.75 }
        def totalIncome(copies:Int):Unit = println(totalCoverprice(copies) + shippingCost(copies))

        totalIncome(60)

    }
}


//05)

object time{
    def main(args:Array[String]):Unit={
        def ease(distance:Int):Int= distance*8
        def tempo(distance:Int):Int= distance*7

      println(ease(2)+tempo(3)+ease(2))

    }
}