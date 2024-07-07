fun main() {
    //Kotlin 에서의 null 체크 : Kotlin에서는 null이 가능한 타입을 완전히 다르게 취급한다
    //Kotlin 에서 자바코드를 사용할 때 null 관련 어노테이션(@Nullable, @NotNull)을 통해
    //nullable을 체크한다
    val str:String? = null
    val str2:String? = "ABC"
    //Safe Call
    //nullable 변수에 메서드콜을 할 때 null체크를 해줘야함. 하지만 Safe Call을 이용하면
    //nullable 변수에 바로 메서드콜을 할 수 있고, 이 때 값은 메서드의 결과가 null이라면 null을 반환
    println(str?.length) // null
    //Elvis 연산자
    //Safe Call 을 한 메서드의 결과값이 null이라면 결과를 세미콜론 옆에 쓴 값으로 대체 할 수있음
    println(str2?.length ?:2) // 3


    println(startsWithA1("Asd"))
    println(startsWithA2(null))
}


//파라미터 null 가능 반환에 null이 불가함
//Safe Call 과 Elvis를 이용
fun startsWithA1(str: String?) : Boolean{
   return str?.startsWith("A") ?: throw IllegalArgumentException("null입니다")
}

//파라미터 null 가능 반환에 null이 가능함
//Safe Call을 이용
fun startsWithA2(str: String?) : Boolean?{
    return str?.startsWith("A")
}

//파라미터 null 가능 반환에 null이 불가능
//Safe Call과 Elvis 이용
fun startsWithA3(str:String?) : Boolean{
    return str?.startsWith("A") ?:false
}

//파리미터는 nullable 변수이지만 절대 null일 수 없는 경우에 이건 null이 아니다 라고 알려주는 방법
// !!을 이용
fun startsWithA4(str:String?) : Boolean?{
    return str!!.startsWith("A")
}
