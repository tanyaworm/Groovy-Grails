import static java.lang.Math.*

int a = 7
int b = 26

println a ** b
println pow(a,b)

assert a ** b == pow(a,b)
//assert a ** b == exp(b*log(a))