byte age = 33
String name = "Tetiana"
String hobby = ",especially fitness and swimming"
def experience = 12

boolean ShortVer = false

if (ShortVer) {
    println ("""    Hello, my name is $name.
    I am $age years old.
    I like sport.
    My experience in IT is $experience years
    """)
} else {
    println ("""    Hello, my name is $name.
    I am $age years old.
    I like sport $hobby.
    I am working in the field of information technologies for about $experience years
    """)
}


