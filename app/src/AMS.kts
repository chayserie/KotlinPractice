import java.util.*

feedTheFish()

fun shouldChangeWater(
    day: String,
    temperature: Int = 20,
    dirty: Int = 20) : Boolean {
//        val isTooHot = temperature > 30
//        val isDirty = dirty > 30
//        val isSunday = day == "Sunday"

        return when {
           isTooHot(temperature) -> true
            isDirty(dirty) -> true
            isSunday(day) -> true
            else -> false
        }
    }
fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

//fun shouldChangeWater2(
//    day: String,
//    temperature: Int = 0,
//    dirty: Int = 0
//){}

    fun feedTheFish(){
        val day = randomDay()
        val food = fishFood(day)
        println("Today is $day and the fish eat $food")
        shouldChangeWater(day, temperature = 50, dirty = 50)
        shouldChangeWater(day)
        shouldChangeWater(day, dirty = 50)
       //shouldChangeWater2(day = "Monday")

        if(shouldChangeWater(day)){
            println("change the water today")
        }
    }

    fun randomDay() : String {
        val week = listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
        return week[Random().nextInt(7)]
    }

    fun fishFood(day: String) : String {
        return when(day) {
            "Monday" -> "flakes"
            "Tuesday" -> "redworms"
            "Wednesday" -> "plankton"
            else -> "fasting"
        }
    }
