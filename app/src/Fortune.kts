var fortune: String = "" //empty string declaration
for(i in 1..10) { //for loop range 1-10
    fortune = getFortune(getBirthday()) //get function
    println("\nYour fortune is: $fortune") //print the fortune value
    if(fortune.contains("Take it easy")) break //check the fortune name if contains Things end the loop
}
fun getBirthday(): Int { //initialize function with intiger data
    print("\nEnter your birthday: ") //emter the birth day
    return readLine()?.toIntOrNull() ?: 1 //return nullable value if invalid 0 then if out of range 1
}

fun getFortune(birthday: Int): String { //pass birthday as parameters
    val fortunes = listOf("You will have a great day!", // list of fortunes
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends, because they are your greatest fortune.")
    val index = when (birthday) { //when statement accept bday
        in 1..7 -> 4 //in range
        28, 31 -> 2  //when statement
        else -> birthday.rem(fortunes.size) //.rem to get the remainder
    }
    return fortunes[index] //return fortune with list index (from birthday)
}

//getFortuneCookie()
//println("\nYour fortune is: ${getFortuneCookie()}")

