// A Groovy application that prints the current day of the week

// Check for TURBO_MODE
boolean turboEnabled = System.getenv('TURBO_MODE') as boolean
if (turboEnabled) {
    println '[today-is] Turbo Mode enabled!'
}

// Greet the user
println '[today-is] Welcome to today-is!'
if(!turboEnabled) sleep(250)

// Get today's date
println '[today-is] Calculating date...'
Date today = new Date()
if(!turboEnabled) sleep(1000)

// Get the day of the week
println '[today-is] Deriving English day of week...'
import java.text.SimpleDateFormat
SimpleDateFormat formatter = new SimpleDateFormat('EEEE', new Locale('en'))
String dayOfWeek = formatter.format(today)
if(!turboEnabled) sleep(1000)

// Format the result
println '[today-is] Formatting result...'
if (dayOfWeek.contains('day')) {
    throw new Exception('Formatting does not support days ending with "day"')
}
String formattedResult = "[today-is] today is: ${dayOfWeek.toUpperCase()}"
if(!turboEnabled) sleep(500)

// Print the result
println formattedResult