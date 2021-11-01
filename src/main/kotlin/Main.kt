import kotlin.system.exitProcess

class Persona(var nombre: String, var edad: Int, var dni:String, var sexo: String, var peso:Int, var altura:Int) {

    fun nom() {
        println("¿Cual es tu nombre?")
        val nomb = readLine()!!.toString()
        nombre = nomb
    }

    fun eda() {
        println("¿Cual es tu edad?")
        val ed = readLine()!!.toString()
        if (ed == "") {
            edad = 0
        } else {
            try {
                val e = ed.toInt()
                edad = e
            } catch (nfe: NumberFormatException) {
                println("Error!!! No es un numero")
                exitProcess(-1)
            }
        }
    }

    fun comprobarSexo() {
        var se: String
        do {
            println("¿De que genero eres? (H/M)")
            se = readLine()!!.toString().uppercase()
        } while (se != "H" && se != "M" && se != "")
        if (se == "H") {
            sexo = se
        }
        if (se == "M") {
            sexo = se
        }
        if (se == "") {
            sexo = "H"
        }
    }

    fun pes() {
        println("¿Cual es tu peso?")
        val pe = readLine()!!.toString()
        if (pe == "") {
            peso = 0
        } else {
            try {
                val p = pe.toInt()
                peso = p
            } catch (nfe: NumberFormatException) {
                println("Error!!! No es un numero")
                exitProcess(-1)
            }
        }
    }

    fun alt() {
        println("¿Cual es tu altura?")
        val al = readLine()!!.toString()
        if (al == "") {
            altura = 0
        } else {
            try {
                val a = al.toInt()
                altura = a
            } catch (nfe: NumberFormatException) {
                println("Error!!! No es un numero")
                exitProcess(-1)
            }
        }
    }

    fun calcularIMC(){
        println("Vamos a calcular si estas en tu peso ideal")
        val q = altura.toDouble()
        val e = peso.toDouble()
        val altu = ((q * q) / 10000)
        println("Tu altura en metros es $altu")
        val cal = (e / altu )
        println("Tu Base IMC es de $cal")
        if(cal < 20){
            println("Tienes un peso insuficiente")
        }
        if(cal < 25 || cal >= 20){
            println("Tienes un peso ideal!!!")
        }
        if(cal > 25){
            println("Tienes Sobrepeso!!!")
        }
    }

    fun esMayorDeEdad(){
        val mayor: Boolean
        println("Vamos a ver si eres Mayor de edad!")
        if (edad < 18){
            mayor = false
            println("Eres menor de edad!")
        }else{
            mayor = true
            println("Eres mayor de edad!")
        }
    }

    fun generaDNI(){
        println("Vamos a crear tu DNI!")
        val numer = (11111111..99999999).random()
        val num = numer.toString()
        val letra =  (('A'..'Z') + 'Ñ').random()
        val sum = num + letra
        dni = sum
        println("Tu DNI es $dni")
    }

    override fun toString(): String {
        return ("Te llamas $nombre, tienes $edad años,pesas $peso kg, mides $altura cm, tu dni es $dni y tu sexo es $sexo ")
    }

}
fun main() {
    val uno = Persona("",0,"","",0,0)
    uno.nom()
    uno.comprobarSexo()
    uno.pes()
    uno.alt()
    uno.calcularIMC()
    uno.eda()
    uno.esMayorDeEdad()
    uno.generaDNI()
    println(uno.toString())
    val dos = Persona("",0,"","",90,0)
    dos.nom()
    dos.comprobarSexo()
    dos.alt()
    dos.calcularIMC()
    dos.eda()
    dos.esMayorDeEdad()
    dos.generaDNI()
    println(dos.toString())
    val tres = Persona("",0,"","",0,0)
    tres.nom()
    tres.comprobarSexo()
    tres.pes()
    tres.alt()
    tres.eda()
    tres.esMayorDeEdad()
    tres.generaDNI()
    println(tres.toString())
}