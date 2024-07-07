//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //코틀린은 변수의 타입을 컴파일러가 추론해주기 때문에 변수의 타입을 명시하는것이 필수가 아님
    var number1 = 10L // 가변
    val number2 = 10L // 불변

    //var number1 변수의 타입을 명시하지 않은 채로 초기값을 넣지 않고 변수를 선언한다면 에러
    //가급적 모든 변수를 val(불변)으로 만든 후 필요에 따라 var(가변)으로 바꾸는 것이 코드를 관리하기 용이

    //코틀린에서 nullable 변수를 사용하려면 ? 를 추가해줘야함
    var num3:Long? = 1_000L
    num3 =null

    //코틀린에서 객체 인스턴스화를 할 때에는 new키워드를 사용하지 않음
    //자바 : Person person = new Person();
    //코틀린 : var person = Person()
}