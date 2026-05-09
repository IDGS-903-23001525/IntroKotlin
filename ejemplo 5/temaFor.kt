/*
Definicion de rangos
val unDigitos= 1...9
val letras = 'a'...'b'

val docena = 1..12
if (5 in docena)
print("El numero 5 esta en el rango docena")

if(18 !in docena)
print("El numero no esta en el rango docena")
*/
fun main(){
    for(i in 1..10)
    print(i)

    for(i in 1..10 step 2) 
    print(i)

    for(i in 10 downTo 1)
    print(i)

    for(i in 10 downTo 1 step 2)
    print(i)
}