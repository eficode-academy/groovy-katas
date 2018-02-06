String story = """\\\\
    At 09:23:54, I walked into the coffee shop.
    Seven seconds later, I asked the barista if they would still be open at 17:30:00.
    He said: "We open at 8:00, and close at 20:00."
    Perfect, I could have a cup of coffee here later, before my train at 18:34:00.
    """.stripIndent()

// Timestamps regex:
// ([01]?[0-9]|2[0-3]):([0-5][0-9])(:?[0-5][0-9])?
